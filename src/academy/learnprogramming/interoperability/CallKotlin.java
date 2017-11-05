package academy.learnprogramming.interoperability;

//import static academy.learnprogramming.interoperability.CarKt.*;

public class CallKotlin {

    public static void main(String[] args) {
        StaticCar.topLevel();

        StaticCar.print("nana java");

        Car car = new Car("blue", "bmw", 2011, true);

        car.setColor("green");
        System.out.println(car.getColor());

        System.out.println(car.isAutomatic());

        System.out.println(car.model);  // annotation
    }

}
