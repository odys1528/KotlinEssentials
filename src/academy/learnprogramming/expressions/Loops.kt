package academy.learnprogramming.expressions


fun main(args: Array<String>) {

    // start and end value are inclusive
    val range = 1..5
    val charRange = 'a'..'z'
    val stringRange = "ABD".."XYZ"
    // println("CCC" in stringRange)

    val backwardRange = 5.downTo(1)
    val reverseRange = range.reversed()

    val stepRange = 3..15
    val step3 = stepRange.step(3)

    // for (s in stringRange) println(s)  // error (iterator)
    for (i in 20 downTo 10 step 5) print("$i ")
    for (i in 1 until 5) print("$i ")  // don't include last number

    val seasons = arrayOf("spring", "summer", "fall", "winter")
    for (season in seasons) println(season)
    for (index in seasons.indices) println(seasons[index])
    print("nana" !in seasons)
    seasons.forEach { println(it) }
    seasons.forEachIndexed { index, value -> println("$value is season number $index") }

    iLoop@ for (i in 1..10) {  // naming loop
        if (i == 7) {
            break@iLoop  // which loop is going to be stopped
        }
    }

}