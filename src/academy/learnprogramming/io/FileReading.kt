package academy.learnprogramming.io

import java.io.File


fun main(args: Array<String>) {

    val lines = File("/home/odys1528/IdeaProjects/KotlinEssentials/src/academy/learnprogramming/io/testfile.txt")
            .reader().readLines()  // list of strings, not for large files
    lines.forEach { println(it) }
    // .readText() - whole file as a single sting

    //------------------------------------------------------------------------------------------------------------------
    val reader = File("/home/odys1528/IdeaProjects/KotlinEssentials/src/academy/learnprogramming/io/testfile.txt")
            .reader()
    println(reader.readText())
    reader.close()  // .close() now is required

    //------------------------------------------------------------------------------------------------------------------
    val lines2 = File("/home/odys1528/IdeaProjects/KotlinEssentials/src/academy/learnprogramming/io/testfile.txt")
            .reader().use { it.readText() }  // .use also closes file
    println(lines2)

    //------------------------------------------------------------------------------------------------------------------
    val lines3 = File("/home/odys1528/IdeaProjects/KotlinEssentials/src/academy/learnprogramming/io/testfile.txt")
            .readText()  // closes file too
    println(lines3)

    //------------------------------------------------------------------------------------------------------------------
    File("/home/odys1528/IdeaProjects/KotlinEssentials/src/academy/learnprogramming/io/testfile.txt")
            .reader().forEachLine { println(it) }  // closes file, reads line by line

}