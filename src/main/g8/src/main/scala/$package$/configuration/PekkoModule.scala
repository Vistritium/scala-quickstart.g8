package $package$.configuration

import org.apache.pekko.actor.ActorSystem
import org.apache.pekko.http.scaladsl.{Http, HttpExt}
import org.apache.pekko.stream.Materializer
import com.google.inject.{AbstractModule, Provides, Singleton}
import net.codingwell.scalaguice.ScalaModule

@Configuration
class PekkoModule extends AbstractModule {

  @Provides
  @Singleton
  def system(): ActorSystem = ActorSystem()

  @Provides
  @Singleton
  def httpClient(actorSystem: ActorSystem): HttpExt = Http()(actorSystem)

}
