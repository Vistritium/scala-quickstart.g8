name := "$name$"

version := "0.1"

scalaVersion := "2.13.10"
val JacksonVersion = "2.14.2"
val AkkaVersion = "2.7.0"

libraryDependencies ++= Seq(
  "com.fasterxml.jackson.module" %% "jackson-module-scala" % JacksonVersion,
  "com.fasterxml.jackson.core" % "jackson-databind" % JacksonVersion,
  "com.google.guava" % "guava" % "31.1-jre",
  "org.apache.commons" % "commons-lang3" % "3.12.0",
  "commons-io" % "commons-io" % "2.11.0",
  "com.iheart" %% "ficus" % "1.5.2",
  "net.codingwell" %% "scala-guice" % "5.1.0",
  "com.google.inject.extensions" % "guice-assistedinject" % "5.1.0",
  "com.typesafe.scala-logging" %% "scala-logging" % "3.9.5",
  "ch.qos.logback" % "logback-classic" % "1.4.5",
  "net.harawata" % "appdirs" % "1.2.1",
  "com.typesafe.akka" %% "akka-actor" % AkkaVersion,
  "com.typesafe.akka" %% "akka-stream" % AkkaVersion,
  "com.typesafe.akka" %% "akka-slf4j" % AkkaVersion,
  "com.typesafe.akka" %% "akka-http" % "10.4.0",
  "org.reflections" % "reflections" % "0.10.2",
)

enablePlugins(SbtTwirl)

mainClass in (Compile, run) := Some("$package$.Main")
