@file:Suppress("DEPRECATION")

plugins {
    id(BuildPlugins.ANDROID_LIBRARY_PLUGIN)
    id(BuildPlugins.KOTLIN_ANDROID_PLUGIN)
    id(BuildPlugins.DAGGER_HILT_PLUGIN)
    id(BuildPlugins.KOTLIN_KAPT)
}

android {
    namespace = "dsm.delivery.data"
    compileSdk = ProjectProperties.COMPILE_SDK

    defaultConfig {
        minSdk = ProjectProperties.COMPILE_SDK
        targetSdk = ProjectProperties.COMPILE_SDK

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = ProjectProperties.JAVA_VERSION
        targetCompatibility = ProjectProperties.JAVA_VERSION
    }
    kotlinOptions {
        jvmTarget = ProjectProperties.JVM_VERSION.toString()
    }
}

dependencies {

    implementation(project(":domain"))

    implementation(Dependency.HILT.HILT)
    implementation(Dependency.HILT.HILT_COMPILER)

    implementation(Dependency.RETROFIT.RETROFIT_CLIENT)
    implementation(Dependency.RETROFIT.GSON_CONVERTER)
    implementation(Dependency.OKHTTP.OKHTTP)

    implementation(Dependency.KOTLIN.COROUTINES_CORE)
    implementation(Dependency.KOTLIN.COROUTINES_ANDROID)

    implementation(Dependency.KOTLIN.COROUTINES_TEST)

    testImplementation(Dependency.TEST.JUNIT)
    testImplementation(Dependency.KOTLIN.COROUTINES_TEST)
}