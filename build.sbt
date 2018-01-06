name := "Recomendador - Carlos, Ignacio, Paloma"

version := "1.43"

scalaVersion := "2.11.11"

libraryDependencies += "org.apache.spark" %% "spark-core" % "2.2.1"
libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.2.1"
libraryDependencies += "org.apache.spark" %% "spark-mllib" % "2.2.1"
libraryDependencies += "org.apache.spark" %% "spark-graphx" % "2.2.1"

// for debugging sbt problems
//logLevel := Level.Debug

scalacOptions += "-deprecation"
