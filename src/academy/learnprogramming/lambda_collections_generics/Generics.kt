package academy.learnprogramming.lambda_collections_generics


fun main(args: Array<String>) {

    val list = mutableListOf("kurwa Spock")
    list.add("nana")
    printCollection(list)

    val list2 = mutableListOf(1, 2, 3)
    printCollection(list2)

    list.printCollection2()

    convertToInt(listOf(1f, -2f, 3.14f))
    append(StringBuilder("string 1"), StringBuilder("string2"))

    val listAny: List<Any> = listOf("nana", 1, 2)
    println(listAny is List<*>)  // erasure

    println(getElementsOfType<Int>(listAny))

}


inline fun <reified T> getElementsOfType(list: List<Any>): List<T> {  // inline and reified because during runtime type is unknown
    var newList: MutableList<T> = mutableListOf()
    list.forEach { if (it is T) newList.add(it) }
    return newList
}


fun <T> append(item1: T, item2: T)
where T: CharSequence, T: Appendable {
    println(item1.append(item2))
}


fun <T: Number?> convertToInt(collection: List<T>) {
    collection.forEach { print("${it?.toInt()} ") }
    println()
}


fun <T: Any> printCollection(collection: List<T>) {  // any = non-nullable
    collection.forEach { print("$it ") }
    println()
}


fun <T> List<T>.printCollection2() {
    this.forEach { print("$it ") }
    println()
}