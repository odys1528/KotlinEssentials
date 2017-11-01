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
    val names = arrayOf("Ada", "Bart", "Celina", "Donald")
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

    //NULL REFERENCES---------------------------------------------------------------------------------------------------
    var str: String? = null  // nullable
    println(str?.toUpperCase())  // null check

    val str2 = str ?: "default"  // elvis operator

    val sth: Any = arrayOf(1, 2, 3)
    val str3: String? = sth as? String  // null

    str = "not null"
    str!!.toUpperCase()  // if we're sure it will never be null

    str?.let { print(it) }  // if str != null, perform operations in {}

    val nullableInts = arrayOfNulls<Int?>(3)

}