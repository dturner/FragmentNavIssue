plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
}

android {
    namespace = "com.example.fragmentnavissue"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.fragmentnavissue"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    buildFeatures {
        compose = true
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)

    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

/*
    //noinspection UseTomlInstead
    implementation(platform("androidx.compose:compose-bom:2024.10.01"))
*/
    //noinspection UseTomlInstead
    implementation("androidx.compose.ui:ui:1.7.5")
    //noinspection UseTomlInstead
    implementation("androidx.compose.foundation:foundation:1.7.5")
    //noinspection UseTomlInstead
    implementation("androidx.compose.material3:material3:1.3.1")
    //noinspection UseTomlInstead
    implementation("androidx.activity:activity-compose:1.9.3")
    //noinspection UseTomlInstead
    implementation("androidx.fragment:fragment:1.8.5")
    //noinspection UseTomlInstead
    implementation("androidx.fragment:fragment-compose:1.8.5")
    //noinspection UseTomlInstead
    implementation("androidx.coordinatorlayout:coordinatorlayout:1.2.0")
    //noinspection UseTomlInstead
    implementation("androidx.navigation:navigation-fragment:2.8.3")
}