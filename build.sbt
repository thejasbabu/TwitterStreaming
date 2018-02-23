name := "TwitterStreaming"

version := "0.1"

scalaVersion := "2.11.0"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-streaming" % "2.2.0",
  "org.apache.bahir" %% "spark-streaming-twitter" % "2.0.0",
  "com.typesafe" % "config" % "1.2.1"
)

resolvers ++= Seq(
  Resolver.sonatypeRepo("snapshots")
)