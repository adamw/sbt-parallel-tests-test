import sbt._
import Keys._

object BuildSettings {
  val scalatest = "org.scalatest" %% "scalatest" % "1.9.1" % "test"

  val buildSettings = Defaults.defaultSettings ++ Seq(

    organization := "com.softwaremill",
    version := "0.0.1-SNAPSHOT",
    scalaVersion := "2.10.0",

    //concurrentRestrictions in Global += Tags.exclusive(Tags.Test),
    concurrentRestrictions in Global += Tags.limit(Tags.Test, 1),

    libraryDependencies += scalatest
  )
}

object SomeBuild extends Build {
  import BuildSettings._

  lazy val parent: Project = Project(
    "root",
    file("."),
    settings = buildSettings
  ) aggregate(sub1, sub2)

  lazy val sub1: Project = Project(
    "sub1",
    file("sub1"),
    settings = buildSettings 
  )

  lazy val sub2: Project = Project(
    "sub2",
    file("sub2"),
    settings = buildSettings 
  )
}
