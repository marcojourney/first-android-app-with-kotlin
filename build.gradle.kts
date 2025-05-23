// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.2.0" apply false
    id("org.jetbrains.kotlin.android") version "1.9.0" apply false
    id("org.sonarqube") version "4.4.1.3373"
}

sonarqube {
    properties {
        property("sonar.projectKey", "android-kotlin")
        property("sonar.host.url", "http://202.79.29.108:9000")
        property("sonar.login", "sqp_7d5ea102d65f7a9f82a0578b4c32930d174afdce") // 🔐 uses GitHub Actions secret
    }
}