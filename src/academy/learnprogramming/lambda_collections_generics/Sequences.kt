package academy.learnprogramming.lambda_collections_generics


fun main(args: Array<String>) {

    val immutableMap = mapOf(1 to Car("green", "toyota", 2015),
            2 to Car("red", "ford", 2016),
            3 to Car("silver", "honda", 2013),
            4 to Car("yellow", "ford", 2011),
            5 to Car("green", "bmw", 2015))

    println(immutableMap.asSequence().filter { it.value.model == "ford" }.map { it.value.color })
    // sequences ~ streams, for large collections
    // intermediate vs terminal operations

    listOf("spring", "summer", "fall", "winter").asSequence()
            .filter { println("filtering $it"); it[0] == 's' }
            .map { println("mapping $it"); it.toUpperCase() }  // til there intermediate, returns seq
            .toList()  // now terminal



}