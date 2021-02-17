buildscript {
    repositories {
        gradlePluginPortal()
        jcenter()
        google()
        mavenCentral()
    }
    dependencies {
        classpath(Plugins.gradle)
        classpath(Plugins.Kotlin.gradle)
        classpath(Plugins.Kotlin.serialization)
        classpath(Plugins.Google.firebaseCrashlyticsGradle)
        classpath(Plugins.Google.playService)
        classpath(Plugins.Google.hilt)
    }
}

tasks.create(name = "deleteBuildDir", type = Delete::class) {
    delete(project.buildDir)
}

allprojects {
    repositories {
        google()
        jcenter()
        mavenCentral()
        maven(url = "https://jitpack.io")
        maven(url = "https://dl.bintray.com/aakira/maven")
    }
}