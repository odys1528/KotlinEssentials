package academy.learnprogramming.interoperability


fun main(args: Array<String>) {

    val sth = Nullability("not null", "null")

    //sth.setNonNullVariable(null)  // error

    //var sth2: String = sth.nullVariable  // error

    //platform type (!)
    //val sth3: Int = sth.nullVariable2  // error

}