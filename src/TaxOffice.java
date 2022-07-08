import java.util.concurrent.atomic.AtomicInteger;

public class TaxOffice {

    AtomicInteger total = new AtomicInteger(0);

    public void addSum(int[] sales) {
        for (int i = 0; i < sales.length; i++) {
            total.addAndGet(sales[i]);
        }

    }

    public int getTotal() {
        return total.get();
    }
}