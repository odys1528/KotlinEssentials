package academy.learnprogramming.oop


fun main(args: Array<String>) {
    val laserPrinter = LaserPrinter("Brother 1234", 15)
    laserPrinter.printModel()

    SomethingElse("nana")

}


// open - because final is by default = extendable
// abstract are open by default
abstract class Printer(val modelName: String) {

    open fun printModel() = println("The model name of this printer is $modelName")
    abstract fun bestSellingPrice(): Double

}


// override also means open
open class LaserPrinter(modelName: String, ppm: Int): Printer(modelName) {

    // constructor(): super()

    final override fun printModel() = println("The model name of this laser printer is $modelName")
    override fun bestSellingPrice(): Double = 129.99

}


class SpecialLaserPrinter(modelName: String, ppm: Int): LaserPrinter(modelName, ppm) {

    // override fun printModel() = println("nana")  // printModel is final, cannot be overridden
}
// calling a super secondary constructor if there's a prime constructor? impossible
// every constructor has to delegate to the primary constructor


open class Something/*(val x: Int)*/: MySubInterface {

    val someProperty: String
    override val number: Int = 25

    constructor(someParameter: String) {
        someProperty = someParameter
        println("parent's constructor")
    }

    override fun myFunction(str: String): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun mySubFunction(num: Int): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}


class SomethingElse: Something {

    constructor(someOtherParameter: String): super(someOtherParameter) {
        println("child's constructor")
    }

}


// data classes are closed
// open data class DataClass(val number: Int) {}

interface MyInterface {

    val number: Int
    // val number2: Int = 50  // error (initialization)
    val number2: Int
        get() = number * 100
    // interfaces don't have backing field

    fun myFunction(str: String): String

}


interface MySubInterface: MyInterface {

    fun mySubFunction(num: Int): String

}