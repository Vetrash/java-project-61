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
}

application { mainClass.set("hexlet.code.App") }

sonar {
    properties {
        property("sonar.projectKey", "Vetrash_java-project-61")
        property("sonar.organization", "vetrash")
        property("sonar.coverage.skip", "true")
    }
}

tasks.test {
}
tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}