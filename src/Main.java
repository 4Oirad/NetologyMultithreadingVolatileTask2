import java.util.Random;

public class Main {

    private final static int MAX_NUMBER_OF_SALES = 10;
    private final static int MAX_SUM_OF_SALE = 1000;

    public static void main(String[] args) throws InterruptedException {

        int[] shop1Sales = arrayGeneration();
        System.out.println("Статистика магазина 1:");
        printArray(shop1Sales);

        int[] shop2Sales = arrayGeneration();
        System.out.println("Статистика магазина 2:");
        printArray(shop2Sales);

        int[] shop3Sales = arrayGeneration();
        System.out.println("Статистика магазина 3:");
        printArray(shop3Sales);

        TaxOffice taxOffice = new TaxOffice();

        Thread shop1 = new Thread(() -> taxOffice.addSum(shop1Sales), "Shop1");
        Thread shop2 = new Thread(() -> taxOffice.addSum(shop2Sales), "Shop2");
        Thread shop3 = new Thread(() -> taxOffice.addSum(shop3Sales), "Shop3");

        shop1.start();
        shop2.start();
        shop3.start();

        shop3.join();
        shop2.join();
        shop1.join();

        System.out.println("Итого, в налоговую инспекцию подана выручка со всех магазинов на сумму " + taxOffice.getTotal() + " рублей");
    }

    static int[] arrayGeneration() {
        Random random = new Random();
        int[] array = new int[random.nextInt(MAX_NUMBER_OF_SALES)];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(MAX_SUM_OF_SALE);
        }
        return array;
    }

    static void printArray(int[] array) {
        if (array.length == 0) {
            System.out.println(0);
        } else {
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    }
}