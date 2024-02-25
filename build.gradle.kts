plugins {
    kotlin("jvm") version "1.9.0"
    application
}

group = "org.oruel"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
//    implementation("org.jetbrains.kotlin:kotlin-script-runtime")
//    implementation("org.jetbrains.kotlin:kotlin-compiler-embeddable")
    testImplementation("org.junit.jupiter:junit-jupiter:5.8.1")
//    testImplementation("org.junit.jupiter:junit-jupiter:5.8.1")
//    testImplementation("org.junit.jupiter:junit-jupiter:5.8.1")
//    testImplementation("junit:junit:4.13.1")
//    testImplementation("junit:junit:4.13.1")
//    runtimeOnly("org.jetbrains.kotlin:kotlin-scripting-jsr223:1.9.22")
//    implementation("org.jetbrains.kotlin:kotlin-script-util:1.8.22")
//    implementation("org.jetbrains.kotlin:kotlin-scripting-compiler-embeddable")

}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(8)
}

application {
    mainClass.set("MainKt")
}