group = "com.willfp"
version = rootProject.version

dependencies {
    compileOnly("io.papermc.paper:paper-api:1.20.2-R0.1-SNAPSHOT")
    compileOnly("io.github.arcaneplugins:levelledmobs-plugin:4.0.2")
    compileOnly("LibsDisguises:LibsDisguises:10.0.42")
    implementation("com.willfp:ModelEngineBridge:1.0.0")
}

tasks {
    build {
        dependsOn(publishToMavenLocal)
    }
}
