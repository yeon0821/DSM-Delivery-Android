plugins {
    id(BuildPlugins.ANDROID_APPLICATION_PLUGIN)
    id(BuildPlugins.KOTLIN_ANDROID_PLUGIN)
    id(BuildPlugins.KOTLIN_KAPT)
    id(BuildPlugins.DAGGER_HILT_PLUGIN)
}

android {
    namespace = ProjectProperties.NAME_SPACE
    compileSdk = 30

    defaultConfig {
        applicationId = ProjectProperties.NAME_SPACE
        minSdk = ProjectProperties.COMPILE_SDK
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        dataBinding = true
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.2.0"
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {


    implementation(Dependency.COMPOSE.VIEWMODEL)
    implementation(Dependency.COMPOSE.ACTIVITY)
    implementation(Dependency.COMPOSE.UI)
    implementation(Dependency.COMPOSE.PREVIEW)
    implementation(Dependency.COMPOSE.MATERIAL)
    implementation(Dependency.COMPOSE.NAVIGATION)
    androidTestImplementation(Dependency.COMPOSE.JUNIT)
    debugImplementation(Dependency.COMPOSE.UI_TOOLING)
    debugImplementation(Dependency.COMPOSE.UI_TEST)

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