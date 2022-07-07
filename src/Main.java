import java.util.Random;
import java.util.concurrent.atomic.LongAdder;

public class Main {

    public static void main(String[] args) {

        //TaxOffice taxOffice = new TaxOffice();
        LongAdder longAdder = new LongAdder();

        int[] shop1Sales = arrayGeneration();

        Thread shop1 = new Thread();
        Thread shop2 = new Thread();
        Thread shop3 = new Thread();

        shop1.start();
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
