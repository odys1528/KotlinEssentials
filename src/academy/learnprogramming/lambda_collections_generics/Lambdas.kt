package academy.learnprogramming.lambda_collections_generics


fun main(args: Array<String>) {

    // run { println("lambda!") }

    val employees = listOf(Employee("John", "Smith", 2012),
            Employee("Jane", "Wilson", 2015),
            Employee("Mary", "Johnson", 2010),
            Employee("Mike", "Jones", 2002))
    println(employees.minBy ({ e: Employee -> e.startYear }))  // minimum startYear: for every e get startYear
    // lambda = last parameter (if not, use parenthesis () around)
    // type, parameter - not always necessary
    println(employees.minBy { it.startYear })
    println(employees.minBy(Employee::startYear))

    var num = 10
    run {  // accessing variables
        num += 15
        println(num)
    }

    run(::topLevel)

    println(countTo10())
    println(countTo5())

    println(findByLastName(employees, "Wilson"))
    println(findByLastName(employees, "nana"))

    "first".apply first@ {
        "second".apply {
            println(toUpperCase())
            println(this@first.toUpperCase())
        }
    }

}


fun findByLastName(employees: List<Employee>, lastName: String) {
    employees.forEach returnBlock@ {
        if (it.lastName == lastName) {
            println("founded")
            return@returnBlock
        }
    }
    println("nope")
}


fun countTo5(): String =
        StringBuilder().apply() {  // apply has return statement
            for (i in 0..4) {
                append(i)  // don't have to refer to the lambda receiver object
                append(", ")
            }
            append(5)
        }.toString()


fun countTo10(): String =
    with(StringBuilder()) {
        for (i in 0..9) {
            append(i)  // don't have to refer to the lambda receiver object
            append(", ")
        }
        append(10)
        toString()
    }



fun topLevel() = println("top level")


fun useParameter(employees: List<Employee>, num: Int) {
    employees.forEach {
        println(it.firstName)
        println(num)
    }
}


data class Employee(val firstName: String, val lastName: String, val startYear: Int)