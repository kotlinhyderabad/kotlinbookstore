plugins {
    java
    kotlin("jvm") version "1.3.72"
    war
}

repositories {
    mavenCentral()
}

dependencies {
    compileOnly("jakarta.platform:jakarta.jakartaee-api:8.0.0")

    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")

    compileOnly("org.eclipse.krazo:krazo-jersey:1.0.0-RC1")
    compileOnly("jakarta.mvc:jakarta.mvc-api:1.1-RC1")

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.6.2")

}




