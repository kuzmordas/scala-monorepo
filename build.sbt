

lazy val app1 = RootProject(file("backend/app1"))
lazy val app2 = RootProject(file("backend/app2"))

lazy val root = project
  .in(file("."))
  .aggregate(
    app1,
    app2
  )