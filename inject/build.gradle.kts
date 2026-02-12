plugins {
    java
}

dependencies {
    compileOnly(rootProject.files(
        "files/CounterCraft.jar",
        "files/minecraft-1.6.4-client-remapped.jar",
        "files/forge-1.6.4-9.11.1.1345-universal.jar"
    ))
}

tasks.withType<JavaCompile>() {
    options.release = 8
}
