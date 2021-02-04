package com.website.gradle

object Dependencies {
  val JUnitVersion = "1.6.2"
  val Kanela = "1.0.7"
  val Logback = "1.2.3"
  val PlayVersion = "2.7.3"
  val ScalaMajor = "2.13"
  val ScalaTestJUnit = "4.0.3"
  val ScalaVersion = ScalaMajor + ".3"

  val scala = s"org.scala-lang:scala-library:$ScalaVersion"
  val guice = s"com.typesafe.play:play-guice_$ScalaMajor:$PlayVersion"
  val logback = s"ch.qos.logback:logback-classic:$Logback"
  val playJsonJoda = s"com.typesafe.play:play-json-joda_$ScalaMajor:2.9.1"
  val junitEngine = s"org.junit.platform:junit-platform-engine:$JUnitVersion"
  val junitLauncher = s"org.junit.platform:junit-platform-launcher:$JUnitVersion"
  val junitRunner = "co.helmethair:scalatest-junit-runner:0.1.6"
  val scalaTestPlay = s"org.scalatestplus.play:scalatestplus-play_$ScalaMajor:$ScalaTestJUnit"
}
