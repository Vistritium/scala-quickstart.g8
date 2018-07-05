name := "$name$"

version := "0.1"

scalaVersion := "2.12.6"

libraryDependencies ++= Seq(
  "com.fasterxml.jackson.module" %% "jackson-module-scala" % "2.9.5",
  "com.fasterxml.jackson.core" % "jackson-databind" % "2.9.5",
  "org.apache.httpcomponents" % "httpclient" % "4.5.5",
  "com.google.guava" % "guava" % "25.1-jre",
  "org.apache.commons" % "commons-lang3" % "3.7",
  "commons-io" % "commons-io" % "2.6",
  "com.iheart" %% "ficus" % "1.4.3",
  "net.codingwell" %% "scala-guice" % "4.2.0",
  "com.typesafe.scala-logging" %% "scala-logging" % "3.9.0",
  "com.iheart" %% "ficus" % "1.4.3",
  "ch.qos.logback" % "logback-classic" % "1.2.3",
  "net.harawata" % "appdirs" % "1.0.1",
  "org.scalaz" %% "scalaz-core" % "7.2.25",
)

mainClass in (Compile, run) := Some("$package$.Main")
