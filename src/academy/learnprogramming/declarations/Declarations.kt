package academy.learnprogramming.declarations

typealias EmployeeSet = Set<Employee>


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

    val employees: EmployeeSet

    val names = arrayListOf("John", "Jane", "Mike")
    // println(names[1])


    val employeeOne = Employee("Mary", 1)
    val employeeTwo = Employee("John", 2)
    val employeeThree = Employee("John", 2)
    println(employeeOne == employeeTwo)  // false
    println(employeeTwo == employeeThree)  // true (in Java: false)
    println(employeeOne.equals(employeeTwo))  // false
    println(employeeTwo.equals(employeeThree))  // true
    // === like .equals in Java
    println(employeeOne === employeeTwo)  // false
    println(employeeTwo === employeeThree)  // false

    val employeeFour = employeeTwo
    println(employeeFour === employeeTwo)  // true
    println(employeeFour != employeeTwo)  // false
    println(employeeFour !== employeeTwo)  // false
    println(employeeTwo != employeeThree)  // false
    println(employeeTwo !== employeeThree)  // true


}


class Employee(var name: String, val id: Int) {

    override fun equals(obj: Any?): Boolean {
        if (obj is Employee) {
            return name == obj.name && id == obj.id
        }
        return false
    }

}