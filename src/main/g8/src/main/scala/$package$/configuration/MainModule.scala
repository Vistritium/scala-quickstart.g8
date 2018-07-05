package $package$.configuration

import com.fasterxml.jackson.databind.{DeserializationFeature, ObjectMapper, SerializationFeature}
import com.fasterxml.jackson.module.scala.DefaultScalaModule
import com.fasterxml.jackson.module.scala.experimental.ScalaObjectMapper
import com.google.inject.{Provides, Singleton}
import com.typesafe.config.{Config, ConfigFactory}
import net.codingwell.scalaguice.ScalaModule

class MainModule extends ScalaModule {

  override def configure(): Unit = {}

  @Provides
  @Singleton
  def provideConfig(): Config = {
    ConfigFactory.load()
  }

  @Provides
  @Singleton
  def mapper(): ScalaObjectMapper = {
    val mapper = new ObjectMapper() with ScalaObjectMapper
    mapper.registerModule(DefaultScalaModule)
    mapper.enable(SerializationFeature.INDENT_OUTPUT)
    mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)
    mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)
    mapper
  }

  @Provides
  @Singleton
  def objectMapper(scalaObjectMapper: ScalaObjectMapper): ObjectMapper = {
    scalaObjectMapper.asInstanceOf[ObjectMapper]
  }

}
