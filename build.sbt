name := "akka-cluster"

version := "1.0-SNAPSHOT"

scalaVersion := "2.12.4"

val akkaVersion = "2.5.11"

scalacOptions ++= Seq("-deprecation", "-feature", "-language:postfixOps")

javacOptions ++= Seq("-Xlint:deprecation", "-Xlint:unchecked")

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % akkaVersion
    withSources() withJavadoc(),
  "com.typesafe.akka" %% "akka-slf4j" % akkaVersion
    withSources() withJavadoc(),
  "com.typesafe.akka" %% "akka-cluster" % akkaVersion
    withSources() withJavadoc(),
  "com.typesafe.akka" %% "akka-cluster-tools" % akkaVersion
    withSources() withJavadoc(),
  "com.typesafe.akka" %% "akka-cluster-metrics" % akkaVersion
    withSources() withJavadoc(),
  "org.slf4j" % "slf4j-simple" % "1.7.7"
    withSources() withJavadoc()
)
