plugins {
    `java-gradle-plugin`
    `kotlin-dsl`
}

apply(from = "../repositories.gradle.kts")

dependencies {
    // Gradle Plugins
    implementation("com.android.tools.build:gradle:4.2.0")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.8.10")
}
