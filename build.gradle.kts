buildscript {
    repositories {
        gradlePluginPortal()
        jcenter()
        google()
        mavenCentral()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.10")
        classpath("com.android.tools.build:gradle:4.1.0-rc01")
    }
}
group = "com.example.my_kmm_app"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}
