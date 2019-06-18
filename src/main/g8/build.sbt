name := "$name$"

version := "0.1"

scalaVersion := "2.12.6"
val JacksonVersion = "2.9.8"
val AkkaVersion = "2.5.19"

libraryDependencies ++= Seq(
  "com.fasterxml.jackson.module" %% "jackson-module-scala" % JacksonVersion,
  "com.fasterxml.jackson.core" % "jackson-databind" % JacksonVersion,
  "com.google.guava" % "guava" % "25.1-jre",
  "org.apache.commons" % "commons-lang3" % "3.7",
  "commons-io" % "commons-io" % "2.6",
  "com.iheart" %% "ficus" % "1.4.3",
  "net.codingwell" %% "scala-guice" % "4.2.1",
  "com.google.inject.extensions" % "guice-assistedinject" % "4.2.0",
  "com.typesafe.scala-logging" %% "scala-logging" % "3.9.0",
  "ch.qos.logback" % "logback-classic" % "1.2.3",
  "net.harawata" % "appdirs" % "1.0.3",
  "org.scalaz" %% "scalaz-core" % "7.2.25",
  "com.jsuereth" %% "scala-arm" % "2.0",
  "com.typesafe.akka" %% "akka-actor" % AkkaVersion,
  "com.typesafe.akka" %% "akka-stream" % AkkaVersion,
  "com.typesafe.akka" %% "akka-slf4j" % AkkaVersion,
  "com.typesafe.akka" %% "akka-http" % "10.1.8",
  "org.reflections" % "reflections" % "0.9.11",
)

enablePlugins(SbtTwirl)

mainClass in (Compile, run) := Some("$name$.Main")
