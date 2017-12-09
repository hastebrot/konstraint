import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

val kotlinVersion by project

plugins {
    kotlin("jvm") version "1.2.0"
}

val compileKotlin: KotlinCompile by tasks
compileKotlin.kotlinOptions.jvmTarget = "1.8"

repositories {
    jcenter()
}

dependencies {
    compile(kotlin("stdlib", "$kotlinVersion"))
    compile(kotlin("stdlib-jdk7", "$kotlinVersion"))
    compile(kotlin("stdlib-jdk8", "$kotlinVersion"))
    compile(kotlin("reflect", "$kotlinVersion"))
}

dependencies {
    testCompile(kotlin("test", "$kotlinVersion"))
    testCompile(kotlin("test-junit", "$kotlinVersion"))
}
