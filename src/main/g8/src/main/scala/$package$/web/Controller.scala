package $package$.web

import org.apache.pekko.http.scaladsl.model.{HttpResponse, StatusCodes}
import org.apache.pekko.http.scaladsl.server.Directives._
import org.apache.pekko.http.scaladsl.server.{Directive1, Route}
import org.apache.pekko.util.Timeout
import com.typesafe.scalalogging.LazyLogging

import scala.concurrent.duration._
import scala.util.{Failure, Success, Try}

@DiscoverableController
abstract class Controller extends LazyLogging {

  protected implicit val timeout: Timeout = Timeout(1.hour)

  def route: Route

  def handleFutureError[T](dir: Directive1[Try[T]])(next: T => Route): Route = {
    dir {
      case Failure(exception) => {
        logger.debug("futureError", exception)
        complete(HttpResponse(status = StatusCodes.InternalServerError, entity = s"\${exception.getMessage}"))
      }
      case Success(value) => next(value)
    }
  }

}
