package academy.learnprogramming.io

import java.io.DataInputStream
import java.io.EOFException
import java.io.FileInputStream


fun main(args: Array<String>) {

    val di = DataInputStream(FileInputStream("/home/odys1528/IdeaProjects/KotlinEssentials/src/academy/learnprogramming/io/testfile.bin"))
    var si: String

    try {
        while (true) {
            println(di.readUTF())
        }
    } catch (e: EOFException) {}

}