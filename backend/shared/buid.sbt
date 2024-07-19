import sbt._
import my.company.sbt.Dependencies
import my.company.sbt.Settings._

lazy val sharedDomain = project
  .in(file("modules/domain"))
  .settings(projectSettings)

lazy val http = project
  .in(file("modules/http"))
  .settings(
    projectSettings,
    Seq(
      libraryDependencies ++= Seq(
        Dependencies.zio,
        Dependencies.zioHttp
      )
    )
  )
  .dependsOn(sharedDomain)

lazy val examples = project
  .in(file("modules/examples"))
  .settings(
    projectSettings
  )
  .dependsOn(
    http
  )
