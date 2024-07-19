import sbt.addSbtPlugin

lazy val commonSettings = Seq(
  organization := "my.organization",
  version := "0.1.0"
)

lazy val root = (project in file("."))
  .settings(
//    scalaVersion := "2.12.9",
    commonSettings ++
      Seq(
        addSbtPlugin("com.eed3si9n" %% "sbt-assembly" % "1.1.0"),
        addDependencyTreePlugin
      ),
    sbtPlugin := true,
    name := "common-settings"
  )