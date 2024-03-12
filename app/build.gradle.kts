plugins {
    application
    checkstyle
}

application {
    mainClass.set("hexlet.code.App")
}

tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}
group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}


