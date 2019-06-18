package $package$.configuration

import akka.actor.ActorSystem
import akka.http.scaladsl.{Http, HttpExt}
import akka.stream.{ActorMaterializer, Materializer}
import com.google.inject.{Provides, Singleton}
import net.codingwell.scalaguice.ScalaModule

@Configuration
class AkkaModule extends ScalaModule {

  @Provides
  @Singleton
  def system(): ActorSystem = ActorSystem()

  @Provides
  @Singleton
  def materializer(actorSystem: ActorSystem): Materializer = ActorMaterializer()(actorSystem)

  @Provides
  @Singleton
  def httpClient(actorSystem: ActorSystem): HttpExt = Http()(actorSystem)

}
