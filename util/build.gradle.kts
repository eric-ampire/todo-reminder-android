plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    compileSdkVersion(Deps.Build.compileSdkVersion)
    buildToolsVersion(Deps.Build.buildToolsVersion)

    defaultConfig {
        multiDexEnabled = true
        minSdkVersion(Deps.Build.minSdkVersion)
        targetSdkVersion(Deps.Build.targetVersion)
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            signingConfig = signingConfigs.getByName("release")
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.txt")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(Deps.AndroidX.core)
    implementation(Deps.AndroidX.appCompat)
    implementation(Deps.Google.Android.material)
    testImplementation(Deps.AndroidX.Test.junit)
    testImplementation(Deps.AndroidX.Test.junit)
    androidTestImplementation(Deps.AndroidX.Test.ext)
    androidTestImplementation(Deps.AndroidX.Test.Expresso.core)
}