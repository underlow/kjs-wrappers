plugins {
    kotlin("multiplatform")
    id("maven-publish")
}
repositories {
    mavenLocal()
    maven { url = uri("https://maven.pkg.jetbrains.space/public/p/kotlinx-html/maven") }
    mavenCentral()
}

val wrapper_react_version = "18.2.0-pre.369"


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
            implementation(project(":kotlin-js-helpers"))

            implementation("org.jetbrains.kotlin-wrappers:kotlin-react:$wrapper_react_version")

        }

    }
    js().compilations["test"].defaultSourceSet { /* ... */ }

}

