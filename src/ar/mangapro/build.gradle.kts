plugins {
    id("com.android.application")
    id("kotlin-android")
}

android {
    compileSdk = 34
    defaultConfig {
        applicationId = "eu.kanade.tachiyomi.extension.ar.mangapro"
        minSdk = 21
        targetSdk = 34
        versionCode = 48
        versionName = "1.4.48"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.6.0")
    implementation("org.jsoup:jsoup:1.16.1")
    implementation("com.squareup.okhttp3:okhttp:4.12.0")
    implementation("io.reactivex:rxjava:1.3.8")
    implementation("androidx.annotation:annotation:1.7.0")
}
