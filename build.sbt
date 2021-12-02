ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.7"

lazy val root = (project in file("."))
  .settings(
    name := "zio-testing-playground",
    libraryDependencies ++= Seq(
      "dev.zio" %% "zio" % "1.0.12"
    )
  )
