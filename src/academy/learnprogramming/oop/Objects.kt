package academy.learnprogramming.oop

import java.time.Year


fun main(args: Array<String>) {
    println(CompanyCommunications.getCopyrightLine())
}


// object class = static class
// no constructors
object CompanyCommunications {

    val currentYear = Year.now().value

    fun getTagLine() = "Our company rocks!"
    fun getCopyrightLine() = "Copyright \u00A9 $currentYear Our Company. All rights reserved."

}