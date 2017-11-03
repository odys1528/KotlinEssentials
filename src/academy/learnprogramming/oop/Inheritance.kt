package academy.learnprogramming.oop


fun main(args: Array<String>) {
    val laserPrinter = LaserPriter("Brother 1234")
    laserPrinter.printModel()
}


// open - because final is by default = extendable
// abstract are open by default
abstract class Printer(val modelName: String) {

    open fun printModel() = println("The model name of this printer is $modelName")
    abstract fun bestSellingPrice(): Double

}


class LaserPriter(modelName: String): Printer(modelName) {

    // constructor(): super()

    override fun printModel() = println("The model name of this laser printer is $modelName")
    override fun bestSellingPrice(): Double = 129.99

}