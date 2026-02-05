plugins {
    java
}

dependencies {
    compileOnly(rootProject.files("files/CounterCraft.jar", "files/minecraft-1.6.4-client-remapped.jar"))
}

tasks.withType<JavaCompile>() {
    options.release = 8
}
