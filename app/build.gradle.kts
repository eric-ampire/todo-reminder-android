import java.time.Instant

plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("kapt")
    id("com.google.firebase.crashlytics")
    id("com.google.gms.google-services")
    id("dagger.hilt.android.plugin")
    id("io.github.reactivecircus.app-versioning") version "0.8.1"
}

kapt {
    correctErrorTypes = true
}

appVersioning {
    overrideVersionCode { _, _, _ ->
        Instant.now().epochSecond.toInt()
    }

    overrideVersionName { gitTag, _, _ ->
        "${gitTag.rawTagName}-alpha-${gitTag.commitHash}"
    }
}

android {
    signingConfigs {
        create("release") {
            keyAlias = "key"
            keyPassword = "ericampire"
            storeFile = file("/Users/ericampire/Workspace/Programming/apk-key.jks")
            storePassword = "ericampire"
        }
    }

    buildFeatures {
        dataBinding = true
        compose = true
    }

    compileSdkVersion(Deps.Build.compileSdkVersion)
    buildToolsVersion(Deps.Build.buildToolsVersion)

    defaultConfig {
        multiDexEnabled = true
        applicationId = "org.ericampire.android.todoreminder"
        minSdkVersion(Deps.Build.minSdkVersion)
        targetSdkVersion(Deps.Build.targetVersion)
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        getByName("debug") {
            signingConfig = signingConfigs.getByName("release")
            isMinifyEnabled = false
            isShrinkResources = false
        }
        getByName("release") {
            signingConfig = signingConfigs.getByName("release")
            isMinifyEnabled = false
            isShrinkResources = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.txt")
        }
    }
}

dependencies {
    implementation(Deps.Google.Android.material)
    // Hilt
    implementation(Deps.Google.Hilt.android)
    kapt(Deps.Google.Hilt.compiler)

    implementation(Deps.AndroidX.Hilt.viewModel)
    kapt(Deps.AndroidX.Hilt.compiler)

    // Kotlin
    implementation(Deps.Kotlin.stdlib)

    // Coroutine
    implementation(Deps.Kotlin.Coroutines.playService)
    implementation(Deps.Kotlin.Coroutines.android)
    implementation(Deps.Kotlin.Coroutines.core)
    implementation(Deps.Kotlin.Coroutines.test)

    // Compose
    implementation(Deps.AndroidX.Compose.Ui.core)
    implementation(Deps.AndroidX.Compose.Ui.tooling)
    implementation(Deps.AndroidX.Compose.Runtime.core)
    implementation(Deps.AndroidX.Compose.Foundation.core)
    implementation(Deps.AndroidX.Compose.Material.core)

    // Mavericks
    implementation(Deps.Airbnb.Mavericks.core)
    androidTestImplementation(Deps.Airbnb.Mavericks.testing)

    // Firebase
    implementation(platform(Deps.Firebase.firebaseBom))
    implementation(Deps.Firebase.crashlytics)
    implementation(Deps.Firebase.analystics)
    implementation(Deps.Firebase.auth)
    implementation(Deps.Firebase.inAppMessaging)
    implementation(Deps.Firebase.firestore)
    implementation(Deps.Firebase.storage)
    implementation(Deps.Firebase.config)
    implementation(Deps.Firebase.messaging)

    // AndroidX
    implementation(Deps.AndroidX.startup)
    implementation(Deps.AndroidX.Preference.preference)
    implementation(Deps.AndroidX.core)
    implementation(Deps.AndroidX.dataStore)
    implementation(Deps.AndroidX.appCompat)

    // Other
    implementation(Deps.Accompanist.glide)
    implementation(Deps.Accompanist.insets)
}

configurations.all {
    resolutionStrategy {
        setForcedModules("org.jetbrains.kotlin:kotlin-parcelize-runtime:${Version.kotlin}" )
        exclude(group = "org.jetbrains.kotlinx", module = "kotlinx-coroutines-debug")
    }
}