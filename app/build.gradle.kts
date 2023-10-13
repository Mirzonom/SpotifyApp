plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("com.google.gms.google-services")
}

android {
    namespace = "com.example.spotifyapp"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.example.spotifyapp"
        minSdk = 24
        targetSdk = 33
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
}

dependencies {

    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("com.google.firebase:firebase-firestore-ktx:24.8.1")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    // Architectural Components
    val lifecycle_version = "2.6.2"
    implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version")
    implementation ("androidx.lifecycle:lifecycle-livedata-ktx:$lifecycle_version")
    implementation ("androidx.lifecycle:lifecycle-runtime-ktx:$lifecycle_version")


//    implementation ('com.google.firebase:firebase-firestore-ktx:24.8.1')

    //implementation fileTree(org.gradle.internal.impldep.bsh.commands.dir: "libs", include: ["*.jar"])



    // Lifecycle
//    implementation "androidx.lifecycle:lifecycle-extensions:2.2.0"
//    implementation "androidx.lifecycle:lifecycle-livedata-ktx:2.2.0"
//    implementation "androidx.lifecycle:lifecycle-runtime:2.2.0"
//    implementation "androidx.lifecycle:lifecycle-runtime-ktx:2.2.0"

    // Coroutines
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.9")
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.3.9")


    // Navigation Component
    val nav_version = "2.5.3"
    implementation ("androidx.navigation:navigation-fragment-ktx:$nav_version")
    implementation ("androidx.navigation:navigation-ui-ktx:$nav_version")

    // Glide
    implementation("com.github.bumptech.glide:glide:4.16.0")

    //Dagger - Hilt
    implementation("com.google.dagger:dagger-android:2.20")
    implementation("androidx.hilt:hilt-lifecycle-viewmodel:1.0.0-alpha02")

    // Timber
    implementation("com.jakewharton.timber:timber:4.7.1")

    // Firebase
    implementation(platform("com.google.firebase:firebase-bom:32.3.1"))
    implementation("com.google.firebase:firebase-analytics-ktx")
    implementation ("com.google.firebase:firebase-auth")
    implementation ("com.google.firebase:firebase-firestore")

    // ExoPlayer
//    api ("com.google.android.exoplayer:exoplayer-core:2.11.8")
//    api ("com.google.android.exoplayer:exoplayer-ui:2.11.8")
//    api ("com.google.android.exoplayer:extension-mediasession:2.11.8")

    implementation ("com.google.android.exoplayer:exoplayer:2.19.1")
    implementation ("com.google.android.exoplayer:exoplayer-core:2.19.1")
    implementation ("com.google.android.exoplayer:exoplayer-dash:2.19.1")
    implementation ("com.google.android.exoplayer:exoplayer-ui:2.19.1")
}