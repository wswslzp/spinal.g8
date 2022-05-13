// give the user a nice default project!
ThisBuild / organization := "com.example"
ThisBuild / scalaVersion := "2.12.13"

lazy val root = (project in file(".")).
  settings(
    name := "spinal.g8"
  )
