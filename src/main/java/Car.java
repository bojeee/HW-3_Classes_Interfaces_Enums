public class Car {
    public static final double MAX_SPEED = 170.0;
    private boolean breakWork;
    private double speed;

    public void setSpeed(double speed) {
        this.speed = speed;
    }


    public void braking() {
        if ((breakWork) && (speed == 0)) {
            System.out.println("Сar brekes");
        }
    }


    public void start() {
        if ((speed > 0) && (!breakWork)) {
            System.out.println("Сar started move");
        }
    }

    public void move() {
        if ((speed > 0) && (speed < MAX_SPEED)) {
            System.out.println("Сar is on fire :D");
        } else if (speed >= MAX_SPEED) {
            System.out.println("Сar speed exceeded the maximum");
            breakWork=true;
        } else {
            System.out.println("Car is standing");
        }
    }
}