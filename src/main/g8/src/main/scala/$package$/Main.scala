package $package$

import com.google.inject.Guice
import $package$.configuration.MainModule

object Main {

  def main(args: Array[String]): Unit = {
    val injector = Guice.createInjector(new MainModule)
    injector.getInstance[Starter](classOf[Starter]).start()
  }

}
