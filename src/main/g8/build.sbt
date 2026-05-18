name := "$name$"

version := "0.1"

scalaVersion := "3.3.6"
val JacksonVersion = "2.18.2"
val PekkoVersion = "1.1.3"

libraryDependencies ++= Seq(
  "com.fasterxml.jackson.module" %% "jackson-module-scala" % JacksonVersion,
  "com.fasterxml.jackson.core" % "jackson-databind" % JacksonVersion,
  "com.google.guava" % "guava" % "33.4.8-jre",
  "org.apache.commons" % "commons-lang3" % "3.17.0",
  "commons-io" % "commons-io" % "2.18.0",
  "com.iheart" %% "ficus" % "1.5.3",
  "net.codingwell" %% "scala-guice" % "7.0.0",
  "com.google.inject.extensions" % "guice-assistedinject" % "7.0.0",
  "com.typesafe.scala-logging" %% "scala-logging" % "3.9.5",
  "ch.qos.logback" % "logback-classic" % "1.5.18",
  "net.harawata" % "appdirs" % "1.2.2",
  "org.apache.pekko" %% "pekko-actor" % PekkoVersion,
  "org.apache.pekko" %% "pekko-stream" % PekkoVersion,
  "org.apache.pekko" %% "pekko-slf4j" % PekkoVersion,
  "org.apache.pekko" %% "pekko-http" % "1.1.0",
  "org.reflections" % "reflections" % "0.10.2",
)

enablePlugins(SbtTwirl)

Compile/mainClass := Some("$package$.Main")