plugins {
    kotlin("jvm") version "1.9.21"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test")
    implementation("com.googlecode.lanterna:lanterna:3.2.0-alpha1")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(19)
}