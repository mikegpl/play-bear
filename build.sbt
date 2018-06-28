name := """Sample project"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

resolvers += Resolver.sonatypeRepo("snapshots")

scalaVersion := "2.12.4"

libraryDependencies += guice
libraryDependencies += "javax.xml.bind" % "jaxb-api" % "2.3.0"
libraryDependencies += "javax.activation" % "activation" % "1.1.1"
libraryDependencies += "com.sun.xml.bind" % "jaxb-impl" % "2.2.11"
libraryDependencies += "com.sun.xml.bind" % "jaxb-core" % "2.2.11"
