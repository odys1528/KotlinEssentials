package academy.learnprogramming.declarations

fun main(args: Array<String>) {
    val number: Int = 25  // val = immutable
    var number2: Int  // var = mutable

    val employee1 = Employee("Jane Doe", 500)

    // employee1 = Employee("nana", 100)  // error

    val employee2: Employee
    val number3 = 100

    if (number < number3) {
        employee2 = Employee("Jane Smith", 400)
    } else {
        employee2 = Employee("Mike Watson", 150)
    }

    // number = "nana"  // error
}

class Employee(var name: String, val id: Int) {

}