import sbt._
import Keys._
import play.Play.autoImport._
import PlayKeys._

object ApplicationBuild extends Build {

    val appName         = "playcode-template"
    val appVersion      = "1.0"
    val appScalaVersion = "2.11.2"

    val appDependencies = Seq(
		// Add your project dependencies here,
		javaCore,
		javaJdbc,
		javaJpa,
		javaWs,
		cache,
		"org.hibernate" % "hibernate-entitymanager" % "4.1.7.Final",
		"javax.mail" % "mail" % "1.4.5",
		"com.h2database" % "h2" % "1.4.177",
		"org.apache.commons" % "commons-lang3" % "3.2.1"
    )

    val main = Project(appName, file(".")).enablePlugins(play.PlayJava).settings(
		// Add your own project settings here
		version := appVersion,
		scalaVersion := appScalaVersion,
		libraryDependencies ++= appDependencies,
		ebeanEnabled := false
    )

}
