package academy.learnprogramming.interoperability;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class CallJava {

    public static int x = 0;

    private String nonNullVariable;
    private String nullVariable;
    private Object object;

    public CallJava(String nonNullVariable, String nullVariable) {
        this.nonNullVariable = nonNullVariable;
        this.nullVariable = nullVariable;
    }

    public Object getObject() { return object; }

    public void setObject(Object object) { this.object = object; }

    public void setNonNullVariable(@NotNull String nonNullVariable) {
        this.nonNullVariable = nonNullVariable;
    }

    public void setNullVariable(@Nullable String nullVariable) {
        this.nullVariable = nullVariable;
    }

    public @NotNull String getNonNullVariable() {
        return nonNullVariable;
    }

    public @Nullable String getNullVariable() {
        return nullVariable;
    }

    public String getNullVariable2() { return nullVariable; }

    public void printStuff(String... strings) {
        for (String s: strings) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public void printIntArray(int[] array) {
        for (int i: array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static String xString() {
        return "this is x: " + x++;
    }

    public void method(Runnable r) {
        new Thread(r).start();

//        new Thread(new Runnable() {  // SAM interface
//            @Override
//            public void run() {
//                System.out.println("I'm in a thread.");
//            }
//        }).start();

//        new Thread(() -> System.out.println("I'm in a thread.")).start();
    }
}
