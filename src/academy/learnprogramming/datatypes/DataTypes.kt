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

    //ARRAYS------------------------------------------------------------------------------------------------------------
    val names = arrayOf("Ada", "Bartek", "Celina", "Donald")
    val longs1 = arrayOf(1L, 2L, 3L)
    val longs2 = arrayOf<Long>(1, 2, 3)
    println(longs1 === longs2)  // false

    val evenNumbers = Array(5){ i -> i * 2 }
    for (n in evenNumbers) {
        println(n)
    }

    val mixedArray = arrayOf(1, "nana", true, null)

    val myIntArray = intArrayOf(1, 2, 3)
    DummyClass().printNumbers(myIntArray)

}