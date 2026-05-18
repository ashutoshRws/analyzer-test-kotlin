plugins {
    kotlin("jvm") version "1.9.23"
}

group = "com.analyzer.test"
version = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    // PROBE-SCA-001
    implementation("com.google.guava:guava:27.0-jre")
    implementation("org.apache.commons:commons-text:1.9")
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(17)
}
