lazy val commonSettings = Seq(
  organization := "com.estus.science",
  scalaVersion := "2.11.7",
  publishTo := Some(Resolver.file("file", new File(Path.userHome.getAbsolutePath + "/.m2/repository"))),
  scalacOptions ++= Seq("-unchecked", "-deprecation")
)

// Estus Optimization
lazy val estusOptimization = (project in file("estus-optimization")).settings(commonSettings: _*)

lazy val estus = (project in file(".")).aggregate(estusOptimization)
