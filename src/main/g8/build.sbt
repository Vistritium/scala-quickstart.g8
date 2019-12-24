name := "$name$"

version := "0.1"

scalaVersion := "2.12.10"
val JacksonVersion = "2.10.1"
val AkkaVersion = "2.6.1"

libraryDependencies ++= Seq(
  "com.fasterxml.jackson.module" %% "jackson-module-scala" % JacksonVersion,
  "com.fasterxml.jackson.core" % "jackson-databind" % JacksonVersion,
  "com.google.guava" % "guava" % "28.1-jre",
  "org.apache.commons" % "commons-lang3" % "3.9",
  "commons-io" % "commons-io" % "2.6",
  "com.iheart" %% "ficus" % "1.4.7",
  "net.codingwell" %% "scala-guice" % "4.2.6",
  "com.google.inject.extensions" % "guice-assistedinject" % "4.2.2",
  "com.typesafe.scala-logging" %% "scala-logging" % "3.9.2",
  "ch.qos.logback" % "logback-classic" % "1.2.3",
  "net.harawata" % "appdirs" % "1.0.3",
  "com.jsuereth" %% "scala-arm" % "2.0",
  "com.typesafe.akka" %% "akka-actor" % AkkaVersion,
  "com.typesafe.akka" %% "akka-stream" % AkkaVersion,
  "com.typesafe.akka" %% "akka-slf4j" % AkkaVersion,
  "com.typesafe.akka" %% "akka-http" % "10.1.11",
  "org.reflections" % "reflections" % "0.9.11",
  "org.typelevel" %% "cats" % "0.9.0",
)

enablePlugins(SbtTwirl)

mainClass in (Compile, run) := Some("$package$.Main")
