package academy.learnprogramming.oop

import java.time.Year


fun main(args: Array<String>) {

    println(CompanyCommunications.getCopyrightLine())

    // println(SomeClass.Companion.accessPrivateVar())
    // println(SomeClass.SomeCompanion.accessPrivateVar())
    println(SomeClass.accessPrivateVar())

    val someClass1 = SomeClass.justAssign("nana")
    val someClass2 = SomeClass.upperOrLowerCase("nana", false)
    println(someClass1.someString)
    println(someClass2.someString)
    // val someClass3 = SomeClass()  // error


    var nana = 0
    // anonymous object, not a singleton
    wantsInterface(object: SomeInterface {
        override fun mustImplement(num: Int): String {
            nana++
            return "This is from mustImplement: $num"
        }
    })

}


// object class = static class
// no constructors
object CompanyCommunications {

    val currentYear = Year.now().value

    fun getTagLine() = "Our company rocks!"
    fun getCopyrightLine() = "Copyright \u00A9 $currentYear Our Company. All rights reserved."

}


class SomeClass private constructor(val someString: String) {

//    val someString: String
//
//    constructor(str: String) {
//        someString = str
//    }
//
//    constructor(str: String, lowerCase: Boolean) {
//        if (lowerCase) {
//            someString = str.toLowerCase()
//        } else {
//            someString = str.toUpperCase()
//        }
//    }

    companion object /*SomeCompanion*/{  // can be called without having an instance, grouping static things
        private var privateVar = 6

        fun accessPrivateVar() = "privateVar = $privateVar"

        // functions below act like constructors
        fun justAssign(str: String) = SomeClass(str)
        fun upperOrLowerCase(str: String, lowerCase: Boolean): SomeClass {
            if (lowerCase) {
                return SomeClass(str.toLowerCase())
            } else {
                return SomeClass(str.toUpperCase())
            }
        }
    }

}


interface SomeInterface {
    fun mustImplement(num: Int): String
}

fun wantsInterface(i: SomeInterface) {
    println("Printing from wantsInterface ${i.mustImplement(5)}")
}