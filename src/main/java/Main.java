import java.util.Random;

public class Main {
    private static final int MAX_RANDOM_VALUE = 171;

    public static void main(String[] args) {
        Random random = new Random();
        Circle circle = new Circle(random.nextInt(46) + 1);
        System.out.println("Circle area is: " + circle.areaOfCircle());

        ObjectCounter objectCounter = new ObjectCounter();
        objectCounter.countRandomizer();
        objectCounter.printCount();

        Car car = new Car();
        car.setSpeed((Math.random() * MAX_RANDOM_VALUE));
        car.start();
        car.move();
        car.braking();
    }
}