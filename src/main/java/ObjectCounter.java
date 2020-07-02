public class ObjectCounter {
    final static public int MAX_RANDOM_VALUE = 4;
    static int counter;

    public ObjectCounter() {
        counter++;
    }

    public void printCount() {
        System.out.println("Counter of random objects is it: " + counter);
    }

    public void countRandomizer() {
        int random = (int) (Math.random() * MAX_RANDOM_VALUE);
        for (int i = 0; i < random; i++) {
            new ObjectCounter();
        }
    }
}
