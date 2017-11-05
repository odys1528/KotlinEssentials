package academy.learnprogramming.interoperability


fun main(args: Array<String>) {

    val sth = CallJava("not null", "null")

    //sth.setNonNullVariable(null)  // error

    //var sth2: String = sth.nullVariable  // error

    //platform type (!)
    //val sth3: Int = sth.nullVariable2  // error

    //.variable = setter/getter or public

    sth.printStuff("a", "b", "c")
    val strings = arrayOf("a", "b", "c")
    sth.printStuff(*strings)

    sth.printIntArray(listOf(1, 2, 3).toIntArray())

    // object (java) = any (kotlin)
    //(sth.`object` as java.lang.Object).notify()

    //static
    println(CallJava.x)
    println(CallJava.xString())

    sth.method({ println("nana") })

}