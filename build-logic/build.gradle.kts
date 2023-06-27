plugins {
    `kotlin-dsl`
}

repositories {
    gradlePluginPortal()
    maven (url =  "https://maven.google.com/")
    mavenCentral()
}

dependencies {
    implementation(libs.jetbrains.kotlin.plugin)
    implementation(libs.android.tools)
}