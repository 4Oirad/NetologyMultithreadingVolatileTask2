import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Shop shop1 = new Shop(arrayGeneration());
        Shop shop2 = new Shop(arrayGeneration());
        Shop shop3 = new Shop(arrayGeneration());

        Thread thread1 = new Thread()
    }

    static int[] arrayGeneration() {
        Random random = new Random();
        int[] array = new int[random.nextInt(500)];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(5000);
        }
        return array;
    }
}
