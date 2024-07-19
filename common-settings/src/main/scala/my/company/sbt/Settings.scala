package my.company.sbt

import sbt.Keys._
import sbt.{AutoPlugin, Def}

object Settings extends AutoPlugin {

  override lazy val projectSettings: Seq[Def.Setting[_]] =
    Seq(
      organization := "my.company",
      scalaVersion := "2.13.12",
      scalacOptions := Seq(
        "-Ymacro-annotations"
      )
    )

}
