package academy.learnprogramming.lambda_collections_generics


fun main(args: Array<String>) {

    val immutableMap = mapOf(1 to Car("green", "toyota", 2015),  // associate key with car
            2 to Car("red", "ford", 2016),
            3 to Car("silver", "honda", 2013),
            4 to Car("yellow", "ford", 2011))

    val mutableMap = mutableMapOf("John's car" to Car("red", "fiat", 2010))
    mutableMap.put("Jane's car", Car("blue", "hyundai", 2012))

    val pair = Pair(10, "ten")
    val (f, s) = pair  // destructing declaration
    val (c, m, y) = Car("green", "toyota", 2015)

    println(immutableMap.map { it.value.color })
    println(immutableMap.filter { it.value.model == "ford" }.map { it.value.color })
    println(immutableMap.all { it.value.model == "ford" })
    println(immutableMap.any { it.value.year > 2014 })
    println(immutableMap.count { it.value.year > 2014 })
    println(immutableMap.values.find { it.year > 2014 })
    println(immutableMap.values.groupBy { it.color })
    println(immutableMap.toSortedMap())
    println(immutableMap.values.sortedBy { it.year })

}


data class Car(val color: String, val model: String, val year: Int) {
    // component functions
    // in data classes it's already done
//    operator fun component1() = color
//    operator fun component2() = model
//    operator fun component3() = year

}