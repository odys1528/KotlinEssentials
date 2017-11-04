package academy.learnprogramming.lambda_collections_generics


fun main(args: Array<String>) {

    val immutableMap = mapOf(1 to Car("green", "toyota", 2015),  // associate key with car
            2 to Car("red", "ford", 2016),
            3 to Car("silver", "honda", 2013))

    val mutableMap = mutableMapOf("John's car" to Car("red", "fiat", 2010))
    mutableMap.put("Jane's car", Car("blue", "hyundai", 2012))

    val pair = Pair(10, "ten")
    val (f, s) = pair  // destructing declaration
    val (c, m, y) = Car("green", "toyota", 2015)

}


class Car(val color: String, val model: String, val year: Int) {
    // component functions
    // in data classes it's already done
    operator fun component1() = color
    operator fun component2() = model
    operator fun component3() = year


}