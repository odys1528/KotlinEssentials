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

    val listAny: Any = listOf("nana")
    println(listAny is List<*>)  // erasure

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