buildscript {
    repositories {
        google()
    }
    
    dependencies {
        classpath("com.google.android.gms:oss-licenses-plugin:0.10.5")
    }
}

// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.0.0" apply false
    id("com.android.library") version "8.0.0" apply false
    id("com.google.gms.google-services") version "4.3.15" apply false
    id("com.google.firebase.crashlytics") version "2.9.7" apply false
}

tasks.register<Delete>("clean") {
    delete(rootProject.buildDir)
}