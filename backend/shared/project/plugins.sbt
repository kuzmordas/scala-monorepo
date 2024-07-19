lazy val root = (project in file(".")).dependsOn(commonSettings)

lazy val commonSettings = RootProject(file("../../../common-settings"))
