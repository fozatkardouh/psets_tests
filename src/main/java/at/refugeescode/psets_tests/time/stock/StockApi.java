package main.time.stock;

import java.util.Arrays;
import java.util.List;

public class StockApi {

    private List<Stock> stocks = Arrays.asList(
            new Stock("GOOGLE", "GOOG", 100.00),
            new Stock("APPLE", "APPL", 100.00),
            new Stock("NETFLIX", "NFLX", 100.00)
    );

    public Stock lookup(String symbol) {
        System.out.println("Looking up symbol: " + symbol);
        waitSomeSeconds(1);
        System.out.println("Found symbol: " + symbol);
        return stocks.stream()
                .filter(stock -> stock.getSymbol().equalsIgnoreCase(symbol))
                .findFirst().get();
    }

    private void waitSomeSeconds(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
