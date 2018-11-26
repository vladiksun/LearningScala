name := "LearningScala"

version := "0.1"

scalaVersion := "2.12.7"

libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.5"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % "test"

libraryDependencies ++= Seq("org.specs2" %% "specs2-core" % "4.3.4" % "test")
scalacOptions in Test ++= Seq("-Yrangepos")

libraryDependencies += "org.scalacheck" %% "scalacheck" % "1.14.0" % "test"