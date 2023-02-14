import org.gradle.api.JavaVersion

object ProjectProperties {


        const val NAME_SPACE = "dsm.delivery.presentation"


        val JAVA_VERSION = JavaVersion.VERSION_1_8

        const val COMPILE_SDK = 33
        const val MIN_SDK_VERSION = 33

        const val KOTLINX_COROUTINES  = "1.3.9"

        const val VERSION_CODE = 1
        const val VERSION_NAME = "1.0"

        const val TEST_RUNNER = "androidx.test.runner.AndroidJUnitRunner"

        const val PROGUARD = "proguard-android-optimize.txt"
        const val PROGUARD_RULES = "proguard-rules.pro"

        const val JVM_VERSION = "1.8"

}