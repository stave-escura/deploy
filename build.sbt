import com.typesafe.sbteclipse.plugin.EclipsePlugin.EclipseKeys

organization := "org.myorg"

name := "deployed"

version := "1.0-SNAPSHOT"

scalaVersion := "2.11.4"

resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

resolvers += "Local" at new File("maven").toURI.toURL+"snapshots"

libraryDependencies +=    "org.myorg" %% "hellodeploy" % "1.0-SNAPSHOT"

lazy val validocDeployedWebsite = (project in file(".")).enablePlugins(PlayScala)

EclipseKeys.withSource := true  