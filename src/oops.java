abstract class Car {
    static {
        System.out.print("1");
    }
    public Car(String name) {
//        super();
        System.out.print("2");
    }
    {
        System.out.print("3");
    }
}

public class oops extends Car {
    {
        System.out.print("4");
    }
    public oops() {
        super("blue");
        System.out.print("5");
    }
    public static void main(String[] gears) {
        new oops();
    }
}