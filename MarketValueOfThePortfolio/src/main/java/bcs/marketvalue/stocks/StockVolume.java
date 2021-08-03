package bcs.marketvalue.stocks;

import java.util.Objects;

public class StockVolume {
    private Stock stock;
    private float volume;

    public StockVolume(Stock stock, float volume) {
        this.stock = stock;
        this.volume = volume;
    }

    public Stock getStock() {
        return stock;
    }

    public float getVolume() {
        return volume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StockVolume)) return false;
        StockVolume that = (StockVolume) o;
        return Float.compare(that.getVolume(), getVolume()) == 0 && getStock().equals(that.getStock());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStock(), getVolume());
    }

    @Override
    public String toString() {
        return "StockVolume{" +
                "stock=" + stock +
                ", volume=" + volume +
                '}';
    }
}