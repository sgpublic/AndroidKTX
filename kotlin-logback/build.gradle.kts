plugins {
    id("java-library")
    kotlin("jvm")

    id("maven-publish")
    id("signing")
    id("java-publish")
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

dependencies {
    implementation(kotlin("reflect"))
    api("org.slf4j:slf4j-api:2.0.7")
}