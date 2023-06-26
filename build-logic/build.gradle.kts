plugins {
    `kotlin-dsl`
}

repositories {
    gradlePluginPortal()
    maven (url =  "https://maven.google.com/")
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.8.10")
    implementation("com.android.tools.build:gradle:8.0.2")
}