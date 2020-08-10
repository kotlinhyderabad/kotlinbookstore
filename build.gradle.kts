plugins {
    java
    war
    kotlin("jvm") version "1.3.72"
//    id("com.moowork.node") version "1.3.1"
    id("org.jetbrains.kotlin.plugin.allopen") version "1.3.72"
}

var jnosqlVersion = "0.0.9"

repositories {
    mavenCentral()
    jcenter()
}

dependencies {
    compileOnly("jakarta.platform:jakarta.jakartaee-api:8.0.0")

    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.72")
    implementation("org.jnosql.diana:diana-document:${jnosqlVersion}")
    implementation("org.jnosql.diana:mongodb-driver:${jnosqlVersion}")

    compileOnly("org.eclipse.krazo:krazo-jersey:1.0.0-RC1")
    compileOnly("jakarta.mvc:jakarta.mvc-api:1.1-RC1")

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.6.2")

}

//allOpen {
//    annotation("javax.persistence.Entity")
//    annotation("javax.persistence.Embeddable")
//    annotation("javax.persistence.MappedSuperclass")
//}
//
//node {
//    version = "12.18.3"
//    npmVersion = "6.14.7"
//    download = true
//    workDir = file("${project.buildDir}/nodejs")
//    npmWorkDir = file("${project.buildDir}/npm")
//    nodeModulesDir = file("${project.projectDir}")
//}
