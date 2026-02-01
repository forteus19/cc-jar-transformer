plugins {
    java
    application
}

group = "dev.vuis"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    compileOnly("org.jetbrains:annotations:26.0.2")

    implementation("org.ow2.asm:asm:9.9.1")
    implementation("org.ow2.asm:asm-tree:9.9.1")
    implementation("net.fabricmc:mapping-io:0.8.0")

    compileOnly("org.projectlombok:lombok:1.18.42")
    annotationProcessor("org.projectlombok:lombok:1.18.42")

    testCompileOnly("org.projectlombok:lombok:1.18.42")
    testAnnotationProcessor("org.projectlombok:lombok:1.18.42")
}

application {
    mainClass = "dev.vuis.cccr.transformer.Main"
}
