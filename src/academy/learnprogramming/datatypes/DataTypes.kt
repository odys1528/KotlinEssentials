package academy.learnprogramming.datatypes

import academy.learnprogramming.javacode.DummyClass

fun main(args: Array<String>) {
    //BUILTIN-----------------------------------------------------------------------------------------------------------
    val myInt = 10
    var myLong = 22L
    val myInt2: Int
    myLong = myInt.toLong()

    var myFloat = 12.34f

    val myCharInf = 65
    println(myCharInf.toChar())

    val vacationTime = false
    val onVacation = DummyClass().isVacationTime(vacationTime)

}