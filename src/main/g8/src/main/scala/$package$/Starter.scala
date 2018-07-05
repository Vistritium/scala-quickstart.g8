package $package$

import com.google.inject.{Inject, Singleton}
import com.typesafe.config.Config
import com.typesafe.scalalogging.LazyLogging

@Singleton
class Starter @Inject()(config: Config) extends LazyLogging {
  def start(): Unit = {

  }
}
