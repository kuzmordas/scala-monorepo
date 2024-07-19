import sbt._
import my.company.sbt.Dependencies
import my.company.sbt.Settings._

lazy val http = ProjectRef(file("../shared"), "http")

lazy val app2 = project
  .in(file("."))
  .settings(
    projectSettings
  )
  .dependsOn(
    http
  )
