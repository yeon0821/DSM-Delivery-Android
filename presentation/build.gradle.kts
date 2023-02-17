plugins {
    id(BuildPlugins.ANDROID_APPLICATION_PLUGIN)
    id(BuildPlugins.KOTLIN_ANDROID_PLUGIN)
    id(BuildPlugins.KOTLIN_KAPT)
    id(BuildPlugins.DAGGER_HILT_PLUGIN)
}

android {
    namespace = "dsm.delivery.presentation"
    compileSdk = ProjectProperties.COMPILE_SDK

    lint{
        baseline = file("lint-baseline.xml")
    }

    defaultConfig {
        applicationId = ProjectProperties.NAME_SPACE
        minSdk = ProjectProperties.MIN_SDK_VERSION
        targetSdk = ProjectProperties.COMPILE_SDK
        versionCode = ProjectProperties.VERSION_CODE
        versionName = ProjectProperties.VERSION_NAME

        testInstrumentationRunner = ProjectProperties.TEST_RUNNER
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile(ProjectProperties.PROGUARD),
                ProjectProperties.PROGUARD_RULES
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
    buildFeatures {
        dataBinding = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.0"
    }
    packagingOptions {
        resources {
            exclude("META-INF/gradle/incremental.annotation.processors")
        }
    }
}

dependencies {


    implementation(project(":domain"))
    implementation(project(":di"))

    implementation(Dependency.GLIDE.GLIDE)

    implementation(Dependency.RETROFIT.RETROFIT_CLIENT)
    implementation(Dependency.RETROFIT.GSON_CONVERTER)
    implementation(Dependency.OKHTTP.OKHTTP)

    implementation(Dependency.HILT.HILT)
    kapt(Dependency.HILT.HILT_COMPILER)

    implementation(Dependency.Android.SPLASH_SCREEN_API)

    implementation(Dependency.PinEntryEditText.PINENTRYEDITTEXT)

    implementation(Dependency.Android.CORE_KTX)
    implementation(Dependency.Android.APP_COMPAT)
    implementation(Dependency.Android.MATERIAL)
    implementation(Dependency.Android.ACTIVITY_KTX)
    implementation(Dependency.Android.FRAGMENT_KTX)
    implementation(Dependency.Android.CONSTRAINT_LAYOUT)

    testImplementation(Dependency.TEST.JUNIT)
    androidTestImplementation(Dependency.TEST.EXT_JUNIT)
    androidTestImplementation(Dependency.TEST.ESPRESSO)
}