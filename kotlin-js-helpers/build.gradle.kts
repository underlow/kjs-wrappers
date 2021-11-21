plugins {
    kotlin("multiplatform")
    id("maven-publish")
}

val wrapper_react_version = "17.0.2-pre.265-kotlin-1.5.31"

repositories {
    mavenLocal()
    maven { url = uri("https://maven.pkg.jetbrains.space/public/p/kotlinx-html/maven") }
    mavenCentral()
}

publishing {
    repositories {
        maven {
            name = "kjs-wrappers"
            url = uri("https://maven.pkg.github.com/underlow/kjs-wrappers")
            credentials {
                username = project.findProperty("gpr.user")?.toString() ?: System.getenv("GPR_USER")?.toString()
                password = project.findProperty("gpr.key")?.toString() ?: System.getenv("GPR_API_KEY")?.toString()
            }
        }
    }
}

kotlin {

    js(BOTH) {
        nodejs()
    }
    js().compilations["main"].defaultSourceSet {
        dependencies {
            implementation("org.jetbrains.kotlin-wrappers:kotlin-react:$wrapper_react_version")

        }

    }
    js().compilations["test"].defaultSourceSet { /* ... */ }

}
