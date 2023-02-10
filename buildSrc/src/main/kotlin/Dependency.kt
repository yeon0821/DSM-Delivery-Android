
object Dependency {

    object Android {
        const val SPLASH_SCREEN_API = "androidx.core:core-splashscreen:${Version.SPLASH_SCREEN_VERSION}"

        const val CONSTRAINT_LAYOUT = "androidx.constraintlayout:constraintlayout:${Version.CONSTRAINT_LAYOUT}"

        const val CORE_KTX = "androidx.core:core-ktx:${Version.CORE_KTX}"
        const val APP_COMPAT = "androidx.appcompat:appcompat:${Version.APP_COMPAT}"

        const val ACTIVITY_KTX = "androidx.activity:activity-ktx:${Version.ACTIVITY_KTX}"
        const val FRAGMENT_KTX = "androidx.fragment:fragment-ktx:${Version.FRAGMENT_KTX}"

        const val MATERIAL = "com.google.android.material:material:${Version.MATERIAL}"
}

    object TEST {
        const val JUNIT = "junit:junit:${Version.JUNIT}"
        const val EXT_JUNIT = "androidx.test.ext:junit:${Version.EXT_JUNIT}"
        const val ESPRESSO = "androidx.test.espresso:espresso-core:${Version.ESPRESSO}"
    }

    object RETROFIT {
        const val RETROFIT_CLIENT = "com.squareup.retrofit2:retrofit:${Version.RETROFIT}"
        const val GSON_CONVERTER = "com.squareup.retrofit2:converter-gson:${Version.RETROFIT}"
    }

    object OKHTTP {
        const val OKHTTP = "com.squareup.okhttp3:okhttp:${Version.OKHTTP}"
    }

    object HILT {
        const val HILT = "com.google.dagger:hilt-android:${Version.HILT}"
        const val HILT_COMPILER = "com.google.dagger:hilt-android-compiler:${Version.HILT}"
        const val INJECT = "javax.inject:javax.inject:1"
    }

    object GLIDE {
        const val GLIDE = "com.github.bumptech.glide:glide:${Version.GLIDE}"
    }

    object KOTLIN {
        const val COROUTINES_CORE = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${ProjectProperties.KOTLINX_COROUTINES}"
        const val COROUTINES_ANDROID = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${ProjectProperties.KOTLINX_COROUTINES}"
        const val COROUTINES_TEST = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Version.COROUTINES_TEST}"

    }



    object PinEntryEditText{
        const val PINENTRYEDITTEXT = "com.alimuzaffar.lib:pinentryedittext:${Version.PINENTRYEDITTEXT}"
    }

}