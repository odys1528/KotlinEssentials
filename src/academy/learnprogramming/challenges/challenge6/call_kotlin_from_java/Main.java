package academy.learnprogramming.challenges.challenge6.call_kotlin_from_java;

public class Main {

    public static void main(String[] args) {

        KotlinCodeKt.sayHelloToJava("Student");

        Employee employee = new Employee("John", "Smith", 2010);
        employee.setStartYear(2009);

        Challenge.INSTANCE.doMath(5, 4);

        //KotlinStuff.sayHelloToJava("Student");  //@file:JvnName

        Employee employee2 = new Employee("John", "Smith", 2010);
        //employee2.startYear = 2009;  // @JvmField

        Challenge.doMath(5, 4);

        employee2.takesDefault("arg1");

    }
}
