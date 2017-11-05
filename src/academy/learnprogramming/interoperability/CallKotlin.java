package academy.learnprogramming.interoperability;

//import static academy.learnprogramming.interoperability.CarKotlinKt.*;

import java.io.IOException;

public class CallKotlin {

    public static void main(String[] args) {
        StaticCar.topLevel();

        StaticCar.print("nana java");

        Car car = new Car("blue", "bmw", 2011, true);

        car.setColor("green");
        System.out.println(car.getColor());
        System.out.println(car.isAutomatic());
        System.out.println(car.model);  // annotation

        // static
        Car.Companion.carComp();
        Car.carComp();  // annotation

        Singleton.INSTANCE.doSomething();
        Singleton.doSomething();  // annotation

        // car.printMe(null);  // illegal argument exception

        try {
            StaticCar.doIO();
        } catch (IOException e) {  // 'that exception is never thrown' (without annotation)
            System.out.println("io exception");
        }

        // default arguments
        StaticCar.defaultArgs();  // annotation

    }

}
