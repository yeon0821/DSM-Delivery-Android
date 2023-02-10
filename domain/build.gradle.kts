plugins {
    id(BuildPlugins.ANDROID_LIBRARY_PLUGIN)
    id(BuildPlugins.DAGGER_HILT_PLUGIN)
    id(BuildPlugins.KOTLIN_ANDROID_PLUGIN)
    id(BuildPlugins.KOTLIN_KAPT)
}

android {
    namespace = ProjectProperties.NAME_SPACE_DOMAIN
    compileSdk = ProjectProperties.COMPILE_SDK

    defaultConfig {
        minSdk = ProjectProperties.MIN_SDK_VERSION
        targetSdk = ProjectProperties.COMPILE_SDK


        testInstrumentationRunner = ProjectProperties.TEST_RUNNER
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
    kotlinOptions {
        jvmTarget = ProjectProperties.JVM_VERSION.toString()
    }
}

dependencies {

    implementation(Dependency.HILT.HILT)
    implementation(Dependency.HILT.HILT_COMPILER)
    implementation(Dependency.HILT.INJECT)

    implementation(Dependency.KOTLIN.COROUTINES_CORE)
    implementation(Dependency.KOTLIN.COROUTINES_ANDROID)

    implementation(Dependency.TEST.JUNIT)
}