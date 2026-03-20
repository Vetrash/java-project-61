plugins {
//    id("java")
    id("com.github.ben-manes.versions") version "0.53.0"
    application
    checkstyle
    id ("org.sonarqube") version "7.2.3.7755"
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

application { mainClass.set("hexlet.code.App") }

sonar {
    properties {
        property("sonar.projectKey", "Vetrash_java-project-61")
        property("sonar.organization", "vetrash")
    }
}

tasks.test {
    useJUnitPlatform()
}
tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}