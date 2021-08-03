package bcs.marketvalue.stocks;

import java.util.Objects;

public class Stock {
    private String      tickerSymbol;
    private String      sector;
    private float       value;

    public Stock() {
    }

    public Stock(String tickerSymbol) {
        this.tickerSymbol = tickerSymbol;
    }

    public String getTickerSymbol() {
        return tickerSymbol;
    }

    public String getSector() {
        return sector;
    }

    public float getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Stock)) return false;
        Stock stock = (Stock) o;
        return Float.compare(stock.getValue(), getValue()) == 0 && getTickerSymbol().equals(stock.getTickerSymbol()) && getSector().equals(stock.getSector());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTickerSymbol(), getSector(), getValue());
    }

    @Override
    public String toString() {
        return "Stock{" +
                "tickerSymbol='" + tickerSymbol + '\'' +
                ", sector='" + sector + '\'' +
                ", value=" + value +
                '}';
    }
}