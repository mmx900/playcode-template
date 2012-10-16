import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "playcode-template"
    val appVersion      = "1.0"

    val appDependencies = Seq(
      // Add your project dependencies here,
		"org.hibernate" % "hibernate-entitymanager" % "4.1.7.Final",
		"javax.mail" % "mail" % "1.4.5"
    )

    val main = PlayProject(appName, appVersion, appDependencies, mainLang = JAVA).settings(
      // Add your own project settings here
		ebeanEnabled := false
    )

}
