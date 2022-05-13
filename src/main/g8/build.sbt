// give the user a nice default project!
ThisBuild / organization := "com.github.$github_id$"
ThisBuild / scalaVersion := "2.12.13"
ThisBuild / version := "v0.1"

val spinalVersion = "latest.release"
val spinal = Seq(
  "com.github.spinalhdl" %% "spinalhdl-core" % spinalVersion,
  "com.github.spinalhdl" %% "spinalhdl-lib" % spinalVersion,
  compilerPlugin("com.github.spinalhdl" %% "spinalhdl-idsl-plugin" % spinalVersion)
)

lazy val root = (project in file(".")).
  settings(
    name := "$name$",
    libraryDependencies ++= spinal,
    fork := true,
    javaOptions := Seq("-Xmx16G")
  )
