// 1. Use Twirl 1.5.1 (Keep this)
addSbtPlugin("com.typesafe.sbt" % "sbt-twirl" % "1.5.1")

// 2. Update Play to the latest 2.6 patch (2.6.25)
// This version is MUCH more compatible with sbt 1.x than 2.6.12
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.6.12")

// 3. Update Ebean to match Play 2.6.25
addSbtPlugin("com.typesafe.sbt" % "sbt-play-ebean" % "4.1.3")

libraryDependencies += "com.typesafe.play" % "play-enhancer" % "1.2.2"