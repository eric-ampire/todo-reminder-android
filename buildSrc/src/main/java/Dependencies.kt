object Version {
    const val koin = "2.2.2"
    const val kotlin = "1.4.30"
    const val coroutines = "1.4.0"
    const val ktor = "1.4.0"
    const val epoxy = "4.3.1"
    const val mavericks = "2.0.0"
    const val workManager = "2.4.0"
    const val accompanist = "0.5.1"
    const val hilt = "2.31.2-alpha"
    const val hiltAndroidX = "1.0.0-alpha03"
    const val firebaseUiVersion = "7.1.1"
    const val lifeCycle = "2.2.0"
    const val glide = "4.11.0"
    const val compose = "1.0.0-alpha12"
    const val playService = "17.0.0"
    const val googleMapUtil = "2.1.1"
    const val paris = "1.7.2"
    const val navigation = "2.3.3"
    const val materialDialogs = "3.3.0"
}

object Module {
    const val data = ":data"
    const val domain = ":domain"
    const val util = ":util"
}

object Plugins {
    const val gradle = "com.android.tools.build:gradle:7.0.0-alpha06"
    const val navigationSafeArgs = "androidx.navigation:navigation-safe-args-gradle-plugin:${Version.navigation}"

    object Google {
        const val playService = "com.google.gms:google-services:4.3.4"
        const val firebaseCrashlyticsGradle = "com.google.firebase:firebase-crashlytics-gradle:2.2.0"
        const val hilt = "com.google.dagger:hilt-android-gradle-plugin:${Version.hilt}"
    }

    object Kotlin {
        const val gradle = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Version.kotlin}"
        const val serialization = "org.jetbrains.kotlin:kotlin-serialization:${Version.kotlin}"
    }
}

object Deps {

    object Build {
        const val compileSdkVersion = 30
        const val buildToolsVersion = "30.0.2"
        const val minSdkVersion = 21
        const val targetVersion = 30
    }

    object Google {
        object Android {
            const val material = "com.google.android.material:material:1.3.0"

            object PlayService {
                const val map = "com.google.android.gms:play-services-maps:${Version.playService}"
                const val location = "com.google.android.gms:play-services-location:${Version.playService}"
            }

            object Map {
                const val ktx = "com.google.maps.android:maps-ktx:${Version.googleMapUtil}"
                const val utils = "com.google.maps.android:maps-utils-ktx:${Version.googleMapUtil}"
            }
        }

        object Hilt {
            const val android = "com.google.dagger:hilt-android:${Version.hilt}"
            const val compiler = "com.google.dagger:hilt-android-compiler:${Version.hilt}"
        }
    }

    object Airbnb {
        object Paris {
            const val core = "com.airbnb.android:paris:${Version.paris}"
            const val processor = "com.airbnb.android:paris-processor:${Version.paris}"
        }
        object Epoxy {
            const val core = "com.airbnb.android:epoxy:${Version.epoxy}"
            const val processor = "com.airbnb.android:epoxy-processor:${Version.epoxy}"
            const val dataBinding = "com.airbnb.android:epoxy-databinding:${Version.epoxy}"
            const val paging = "com.airbnb.android:epoxy-paging:${Version.epoxy}"
            const val glidePreloading = "com.airbnb.android:epoxy-glide-preloading:${Version.epoxy}"
        }

        object Lottie {
            const val lottie = "com.airbnb.android:lottie:3.4.1"
        }

        object Mavericks {
            const val testing = "com.airbnb.android:mavericks-testing:${Version.mavericks}"
            const val core = "com.airbnb.android:mavericks:${Version.mavericks}"
            const val mocking = "com.airbnb.android:mavericks-mocking:${Version.mavericks}"
        }
    }


    object Firebase {
        const val firebaseBom = "com.google.firebase:firebase-bom:26.4.0"
        const val crashlytics = "com.google.firebase:firebase-crashlytics-ktx"
        const val analystics = "com.google.firebase:firebase-analytics-ktx"
        const val auth = "com.google.firebase:firebase-auth-ktx"
        const val firestore = "com.google.firebase:firebase-firestore-ktx"
        const val storage = "com.google.firebase:firebase-storage-ktx"
        const val config = "com.google.firebase:firebase-config-ktx"
        const val messaging = "com.google.firebase:firebase-messaging-ktx"
        const val inAppMessaging = "com.google.firebase:firebase-inappmessaging-display-ktx"

        object UI {
            const val database = "com.firebaseui:firebase-ui-database:${Version.firebaseUiVersion}"
            const val firestore =
                "com.firebaseui:firebase-ui-firestore:${Version.firebaseUiVersion}"
            const val auth = "com.firebaseui:firebase-ui-auth:${Version.firebaseUiVersion}"
            const val storage = "com.firebaseui:firebase-ui-storage:${Version.firebaseUiVersion}"
        }
    }

    object Ktor {
        const val core = "io.ktor:ktor-client-core:${Version.ktor}"
        const val android = "io.ktor:ktor-client-android:${Version.ktor}"
        const val cio = "io.ktor:ktor-client-cio:${Version.ktor}"
        const val serialization = "io.ktor:ktor-client-serialization-jvm:${Version.ktor}"
        const val logging = "io.ktor:ktor-client-logging-jvm:${Version.ktor}"
    }

    object Koin {
        const val android = "org.koin:koin-android:${Version.koin}"
        const val androidX = "org.koin:koin-androidx-ext:${Version.koin}"
        const val scope = "org.koin:koin-androidx-scope:${Version.koin}"
        const val viewModel = "org.koin:koin-androidx-viewmodel:${Version.koin}"
        const val fragment = "org.koin:koin-androidx-fragment:${Version.koin}"
        const val test = "org.koin:koin-test:${Version.koin}"
    }

    object Facebook {
        const val shimmer = "com.facebook.shimmer:shimmer:0.5.0"
        const val login = "com.facebook.android:facebook-login:9.0.0"
    }

    object Kotlin {
        const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Version.kotlin}"
        const val gradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Version.kotlin}"

        object Coroutines {
            const val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Version.coroutines}"
            const val android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Version.coroutines}"
            const val playService =
                "org.jetbrains.kotlinx:kotlinx-coroutines-play-services:${Version.coroutines}"
            const val test = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Version.coroutines}"
        }

        object Serialization {
            const val plugin = "org.jetbrains.kotlin:kotlin-serialization:${Version.kotlin}"
            const val core = "org.jetbrains.kotlinx:kotlinx-serialization-core:${Version.kotlin}"
        }
    }

    object AndroidX {

        const val core = "androidx.core:core-ktx:1.3.1"
        const val contraintLayout = "androidx.constraintlayout:constraintlayout:2.1.0-alpha2"
        const val appCompat = "androidx.appcompat:appcompat:1.3.0-beta01"
        const val dataStore = "androidx.datastore:datastore:1.0.0-alpha05"
        const val legacy = "androidx.legacy:legacy-support-v4:1.0.0"
        const val startup = "androidx.startup:startup-runtime:1.0.0-beta01"

        object Compose {
            object Ui {
                const val core = "androidx.compose.ui:ui:${Version.compose}"
                const val uiTest = "androidx.compose.ui:ui-test:${Version.compose}"
                const val tooling = "androidx.compose.ui:ui-tooling:${Version.compose}"
            }

            object Foundation {
                const val core = "androidx.compose.foundation:foundation:${Version.compose}"
                const val layout = "androidx.compose.foundation:layout:${Version.compose}"
            }

            object Runtime {
                const val core = "androidx.compose.runtime:runtime:${Version.compose}"
                const val liveData = "androidx.compose.runtime:runtime-livedata:${Version.compose}"
                const val rxJava = "androidx.compose.runtime:runtime-rxjava2:${Version.compose}"
            }

            object Material {
                const val core = "androidx.compose.material:material:${Version.compose}"
                const val iconsCore = "androidx.compose.material:material-icons-core:${Version.compose}"
                const val iconsExtended = "androidx.compose.material:material-icons-extended:${Version.compose}"
            }
        }

        object Lifecycle {
            const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Version.lifeCycle}"
            const val livedata = "androidx.lifecycle:lifecycle-livedata-ktx:${Version.lifeCycle}"
            const val runtime = "androidx.lifecycle:lifecycle-runtime-ktx:${Version.lifeCycle}"
        }

        object Hilt {
            const val viewModel = "androidx.hilt:hilt-lifecycle-viewmodel:${Version.hiltAndroidX}"
            const val compiler = "androidx.hilt:hilt-compiler:${Version.hiltAndroidX}"
            const val navigation = "androidx.hilt:hilt-navigation-fragment:${Version.hiltAndroidX}"
        }

        object WorkManager {
            const val workRuntimeKtx = "androidx.work:work-runtime-ktx:${Version.workManager}"
            const val workTesting = "androidx.work:work-testing:${Version.workManager}"
        }

        object Navigation {
            const val fragment = "androidx.navigation:navigation-fragment-ktx:${Version.navigation}"
            const val ui = "androidx.navigation:navigation-ui-ktx:${Version.navigation}"
            const val test = "androidx.navigation:navigation-testing:${Version.navigation}"
        }

        object Preference {
            private const val version = "1.1.1"
            const val preference = "androidx.preference:preference:$version"
        }

        object Test {
            const val ext = "androidx.test.ext:junit:1.1.1"
            const val junit = "junit:junit:4.13"
            const val fragment = "androidx.fragment:fragment-testing:1.2.5"

            object Expresso {
                private const val version = "3.2.0"
                const val core = "androidx.test.espresso:espresso-core:$version"
            }
        }
    }

    object Glide {
        const val core = "com.github.bumptech.glide:glide:${Version.glide}"
        const val compiler = "com.github.bumptech.glide:compiler:${Version.glide}"
    }

    object MaterialDialogs {
        const val core = "com.afollestad.material-dialogs:core:${Version.materialDialogs}"
        const val bottomsheets = "com.afollestad.material-dialogs:bottomsheets:${Version.materialDialogs}"
        const val lifecycle = "com.afollestad.material-dialogs:lifecycle:${Version.materialDialogs}"
    }

    object Accompanist {
        const val glide = "dev.chrisbanes.accompanist:accompanist-glide:${Version.accompanist}"
        const val insets = "dev.chrisbanes.accompanist:accompanist-insets:${Version.accompanist}"
    }


    const val androidChart = "com.github.PhilJay:MPAndroidChart:v3.1.0"
    const val transmationLayout = "com.github.skydoves:transformationlayout:1.0.5"
    const val vvalidator = "com.afollestad:vvalidator:0.5.2"
    const val ucrop = "com.github.yalantis:ucrop:2.2.6-native"
    const val roundImageView = "com.makeramen:roundedimageview:2.3.0"
    const val speedDial = "com.leinardi.android:speed-dial:3.1.1"
    const val dexter = "com.karumi:dexter:6.2.1"
    const val autoImageSlider = "com.github.smarteist:autoimageslider:1.4.0"
    const val viewBindingUtil = "com.github.yogacp:android-viewbinding:1.0.2"
    const val localization = "com.zeugmasolutions.localehelper:locale-helper-android:1.1.4"
    const val jodaTime = "net.danlew:android.joda:2.10.9"
    const val timber = "com.jakewharton.timber:timber:4.7.1"
    const val pinview = "com.chaos.view:pinview:1.4.4"
}