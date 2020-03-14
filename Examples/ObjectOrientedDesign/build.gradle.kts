// Self-contained Gradle build to run app and/or generate a "fat jar"
// which can be run with "java -jar ExploreMazeKt.jar"
//
// To use from the top directory:
//
// ```shell
// ./gradlew --project-dir='Examples/ObjectOrientedDesign'
// ```
//
// To use from the ObjectOrientedDesign directory:
//
// ```shell
// cd 'Examples/ObjectOrientedDesign'
// ../../gradlew --project-dir='.'
// ```

import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.3.70"
    id("com.github.johnrengelman.shadow") version "5.2.0"
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(platform(kotlin("bom")))
    implementation(kotlin("stdlib"))
    implementation(kotlin("reflect"))
}

defaultTasks("shadowJar")

fun file(path: String) = File(rootDir, path)

val srcRoot = file("..") // 'Examples'
val sources = listOf(
        file("../AtomicTest/AtomicTest.kt"),
        file("ExploreMaze.kt"),
        file("Factory.kt"),
        file("MazeView.kt"),
        file("Players.kt"),
        file("Result.kt"),
        file("RobotMaze.kt"),
        file("Room.kt"),
        file("Stage.kt"),
        file("Urge.kt"),
        file("View.kt")
)

val moduleName = "ExploreMazeKt"
val mainClass = "oodesign.ExploreMazeKt"

kotlin.target.compilations["main"].defaultSourceSet {
    kotlin.setSrcDirs(listOf(srcRoot))
    kotlin.include(sources.map { it.toRelativeString(srcRoot) })
}

tasks.withType<KotlinCompile> {
    kotlinOptions.freeCompilerArgs = listOf("-module-name", moduleName)
}

tasks.withType<Jar> {
    archiveBaseName.set(moduleName)
}

tasks.withType<ShadowJar> {
    manifest.attributes["Main-Class"] = mainClass
}

application {
    mainClassName = mainClass
}
