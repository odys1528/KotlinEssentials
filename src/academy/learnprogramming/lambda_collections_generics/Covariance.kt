package academy.learnprogramming.lambda_collections_generics


fun main(args: Array<String>) {

    val shortList: MutableList<Short> = mutableListOf(1, 2, 3, 4, 5)
    convertToInt(shortList)  // it shouldn't work xd

}


fun convertToInt(collection: MutableList<Number>) {
    collection.forEach { print("${it.toInt()} ") }
    println()
}


open class Flower

class Rose: Flower()

//class Garden<T: Flower>  // invariant class
class Garden<out T: Flower> { // covariant class = immutable

    val flowers: List<T> = listOf()

    fun pickFlower(i: Int): T = flowers[i]  // T as out type - ok
    // fun plantFlower(flower: T) {}  // T as in type - err

}

fun waterGarden(garden: Garden<Flower>) {}

fun tendGarden(garden: Garden<Rose>) {
    waterGarden(garden)
}