plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
}

android {
    namespace = "appinventor.ai_arm25412.vistech"
    compileSdk = 35

    defaultConfig {
        applicationId = "appinventor.ai_arm25412.vistech"
        minSdk = 23
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)
    implementation("androidx.camera:camera-core:1.3.1")
    implementation("androidx.camera:camera-camera2:1.3.1")
    implementation("androidx.camera:camera-lifecycle:1.3.1")
    implementation("androidx.camera:camera-view:1.3.1")

    implementation ("androidx.compose.ui:ui:1.5.0")

    implementation("org.tensorflow:tensorflow-lite:2.12.0")
    implementation("org.tensorflow:tensorflow-lite-task-vision:0.4.4")
    implementation("org.tensorflow:tensorflow-lite-support:0.4.4")

    implementation ("androidx.compose.material:material-icons-extended:1.6.1")
    implementation ("androidx.compose.material3:material3:1.2.1")

    implementation ("androidx.compose.material:material-icons-extended:1.6.1")
    implementation ("androidx.compose.material3:material3:1.2.1")
    implementation ("androidx.navigation:navigation-compose:2.7.7")

    // CameraX core library
    implementation ("androidx.camera:camera-camera2:1.3.0")
    implementation ("androidx.camera:camera-lifecycle:1.3.0")
    implementation ("androidx.camera:camera-view:1.3.0")

// ML Kit object detection (if using ML Kit)
    implementation ("com.google.mlkit:object-detection:17.0.0")

// Or TensorFlow Lite if you use TFLite
// implementation 'org.tensorflow:tensorflow-lite-task-vision:0.4.0'

    implementation ("androidx.compose.material3:material3:1.1.0")
    implementation ("androidx.activity:activity-compose:1.8.2")
//    implementation ("com.google.android.gms:play-services-speech:21.0.1")

// face analysis
    implementation ("com.google.mlkit:face-detection:16.1.5")

}