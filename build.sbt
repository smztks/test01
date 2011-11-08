name := "default"

version := "0.0.1-SNAPSHOT"

scalaVersion := "2.8.1"

organization := "example.com"

libraryDependencies += "org.scalatest" % "scalatest_2.8.1" % "1.5.1"

resolvers += "Maven Repository" at "http://undercover.googlecode.com/svn/maven/repository"

libraryDependencies += "com.proinnovate" % "sbt-coverage_2.7.7" % "0.2"

scalacOptions ++= Seq("-unchecked", "-deprecation", "-Xmigration")