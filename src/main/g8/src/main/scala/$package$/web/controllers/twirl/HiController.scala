package $package$.web.controllers.twirl

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import com.google.inject.{Inject, Singleton}
import $package$.web.{DiscoverableController, TwirlController}

@Singleton
@DiscoverableController
class HiController @Inject()(
) extends TwirlController {
  override def route: Route = pathSingleSlash {
    get {
      complete(html.index.render())
    }
  }
}
