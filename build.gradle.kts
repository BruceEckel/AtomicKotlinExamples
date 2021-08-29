plugins {
    kotlin("jvm") version "1.5.30"
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(8))
    }
}

repositories {
    mavenCentral()
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions {
        suppressWarnings = true
    }
}

sourceSets {
    named("main") {
        java.srcDir("Examples")
    }
    named("test") {
        java.srcDir("Tests")
    }
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation(kotlin("reflect"))

    // For tests in Examples
    implementation(kotlin("test"))

    // For tests in Tests
    testImplementation(kotlin("test-junit"))

    // Logging
    implementation("io.github.microutils:kotlin-logging:1.4.6")
    implementation("org.slf4j:slf4j-simple:1.7.25")
}

apply(from = "gradle/tasks.gradle")

tasks.withType<Test> {
    testLogging {
        exceptionFormat = org.gradle.api.tasks.testing.logging.TestExceptionFormat.FULL
    }
}

tasks.register<generating.GenerateTests>("GenerateTests")