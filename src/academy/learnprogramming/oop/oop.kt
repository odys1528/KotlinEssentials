package academy.learnprogramming.oop

// top-level - public and final by default
// no matching name requirements
// private = visible in file
// internal = visible in module

fun main(args: Array<String>) {
    val emp = Employee("Danuta", "Renata", 123)
}

class Employee constructor(firstName: String, lastName: String, val id: Int) {  // declaration of primary constructor
    // 'constructor' keyword unnecessary, can be used for defining visibility of constructor
    // default empty constructor

    val firstName: String  // property declaration
    val lastName: String = lastName  // 2nd way

    init {  // initializer block, in conjunction with primary constructor
        this.firstName = firstName
    }

}

class Employee2(val firstName: String, var id: Int = 666) {  // default parameter
    var fullTime = true

    constructor(firstName: String, fullTime: Boolean): this(firstName) {  // secondary constructor,
                                                    // this - passes the value from primary constructor
        this.fullTime = fullTime
    }
}