plugins {
    id("java")
}

group = "com.test"
version = "6.0.8-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation(project(":spring-context"))
}

tasks.test {
    useJUnitPlatform()
}