plugins {
    id("org.jetbrains.compose")
    id("com.android.application")
    kotlin("android")
}

group "com.github.yagiryu"
version "1.0-SNAPSHOT"

repositories {
    jcenter()
}

dependencies {
    implementation("androidx.activity:activity-compose:1.6.0")
}

android {
    compileSdkVersion(31)
    defaultConfig {
        applicationId = "com.github.yagiryu.android"
        minSdkVersion(24)
        targetSdkVersion(31)
        versionCode = 1
        versionName = "1.0-SNAPSHOT"
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}