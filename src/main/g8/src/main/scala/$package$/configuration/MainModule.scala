package $package$.configuration

import akka.actor.ActorSystem
import com.fasterxml.jackson.databind.{DeserializationFeature, ObjectMapper, SerializationFeature}
import com.fasterxml.jackson.module.scala.DefaultScalaModule
import com.google.inject.{AbstractModule, Provides, Singleton}
import com.typesafe.config.Config
import com.typesafe.scalalogging.LazyLogging
import net.codingwell.scalaguice.ScalaModule
import org.reflections.Reflections

import scala.concurrent.ExecutionContext

class MainModule(config: Config) extends AbstractModule with LazyLogging {

  override def configure(): Unit =
    new Reflections(getClass.getPackage.getName)
      .getTypesAnnotatedWith(classOf[Configuration])
      .forEach { c =>
        logger.debug(s"Installing \$c")
        install(c.newInstance().asInstanceOf[AbstractModule])
      }

  @Provides
  @Singleton
  def provideConfig(): Config = config

  @Provides
  @Singleton
  def mapper(): ObjectMapper = {
    val mapper = new ObjectMapper()
    mapper.registerModule(DefaultScalaModule)
    mapper.enable(SerializationFeature.INDENT_OUTPUT)
    mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)
    mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)
    mapper
  }

  @Provides
  @Singleton
  def executionContext(actorSystem: ActorSystem): ExecutionContext = actorSystem.dispatcher

}
