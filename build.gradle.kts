plugins {
    kotlin("jvm") version "1.9.22"
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "18"
    }

    test {
        useJUnitPlatform()
    }
}
