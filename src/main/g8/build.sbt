name := "$name$"

version := "0.1"

scalaVersion := "2.13.7"
val JacksonVersion = "2.13.0"
val AkkaVersion = "2.6.17"

libraryDependencies ++= Seq(
  "com.fasterxml.jackson.module" %% "jackson-module-scala" % JacksonVersion,
  "com.fasterxml.jackson.core" % "jackson-databind" % JacksonVersion,
  "com.google.guava" % "guava" % "31.0.1-jre",
  "org.apache.commons" % "commons-lang3" % "3.12.0",
  "commons-io" % "commons-io" % "2.11.0",
  "com.iheart" %% "ficus" % "1.5.1",
  "net.codingwell" %% "scala-guice" % "5.0.2",
  "com.google.inject.extensions" % "guice-assistedinject" % "5.0.1",
  "com.typesafe.scala-logging" %% "scala-logging" % "3.9.2",
  "ch.qos.logback" % "logback-classic" % "1.2.7",
  "net.harawata" % "appdirs" % "1.2.1",
  "com.typesafe.akka" %% "akka-actor" % AkkaVersion,
  "com.typesafe.akka" %% "akka-stream" % AkkaVersion,
  "com.typesafe.akka" %% "akka-slf4j" % AkkaVersion,
  "com.typesafe.akka" %% "akka-http" % "10.2.7",
  "org.reflections" % "reflections" % "0.10.2",
)

enablePlugins(SbtTwirl)

mainClass in (Compile, run) := Some("$package$.Main")
