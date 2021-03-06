package academy.learnprogramming.declarations

typealias EmployeeSet = Set<Employee>


fun main(args: Array<String>) {
    //DECLARATIONS------------------------------------------------------------------------------------------------------
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

    //EQUALS------------------------------------------------------------------------------------------------------------
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

    //BIT OPERATORS-----------------------------------------------------------------------------------------------------
    val x = 0x00101110
    val y = 0x00110010

    //println(x or y)  // there are no | and & operators

    //CASTING-----------------------------------------------------------------------------------------------------------
    var sth: Any = employeeFour
    if(sth is Employee) {
        // val newEmployee = sth as Employee  // unnecessary
        println(sth.name)
    }

    //STRING TEMPLATES--------------------------------------------------------------------------------------------------
    println(employee1)

    val change = 4.22
    println("\$$change, $$change")

    val numerator = 10.99
    val denominator = 20.00
    println("${numerator/denominator}")
    println("${employee1.name}")

    //RAW STRINGS-------------------------------------------------------------------------------------------------------
    val filePath = """C:\somedir\somedir2"""
    val rhyme = """nana
                *nana
                *nana""".trimMargin("*")  // default |
    print(rhyme)

}


class Employee(var name: String, val id: Int) {

    override fun equals(obj: Any?): Boolean {
        if (obj is Employee) {
            return name == obj.name && id == obj.id
        }
        return false
    }

    override fun toString(): String {
        return "Employee(name=$name, id=$id)"
    }


}