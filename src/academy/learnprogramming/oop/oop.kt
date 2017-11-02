package academy.learnprogramming.oop

// top-level - public and final by default
// no matching name requirements
// private = visible in file
// internal = visible in module


fun main(args: Array<String>) {
    val emp = Employee("Danuta", "Renata", 123)
    // println(emp.firstName)
    val emp2 = Employee2("Spock")
    // println(emp2.fullTime)  // error: private
    val emp3 = Employee3("Kirk")
    // println(emp3.fullTime)  // running the custom set
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
    private var fullTime = true

    constructor(firstName: String, fullTime: Boolean): this(firstName) {  // secondary constructor,
                                                    // this - passes the value from primary constructor
        this.fullTime = fullTime
    }
}


// when using getter/setter, variable cannot be declared in primary constructor
class Employee3(val firstName: String, fullTime: Boolean = true) {

    var fullTime = fullTime
    // setter/getter directly under declaration
    get() {
        println("Running the custom get")
        return field
    }

    set(value) {
        println("Running the custom set")
        field = value
    }
}