val kotlin_version = "1.7.10"

plugins {
    kotlin("multiplatform") version "1.7.10" apply false
    kotlin("plugin.serialization") version "1.7.10" apply false
    id("net.saliman.properties") version "1.5.1" apply false
    id("maven-publish")
}


allprojects {
//    apply plugin: 'net.saliman.properties'

    group = "com.github.underlow"
    version = "0.4"

}
