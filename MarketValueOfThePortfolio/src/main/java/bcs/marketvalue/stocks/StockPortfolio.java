package bcs.marketvalue.stocks;

import java.util.Arrays;
import java.util.Objects;

public class StockPortfolio {
    private StockVolume[]   stocks;
    private float           assertValue;

    public StockPortfolio(StockVolume[] stocks) {
        this.stocks = stocks;
        for (StockVolume stockVolume : stocks) {
            this.assertValue += stockVolume.getStock().getValue();
        }
    }

    public StockVolume[] getStocks() {
        return stocks;
    }

    @Override
    public String toString() {
        return "StockPortfolio{" +
                "stocks=" + Arrays.toString(stocks) +
                ", assertValue=" + assertValue +
                '}';
    }

    public float getAssertValue() {
        return assertValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StockPortfolio)) return false;
        StockPortfolio that = (StockPortfolio) o;
        return Float.compare(that.getAssertValue(), getAssertValue()) == 0 && Arrays.equals(getStocks(), that.getStocks());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getAssertValue());
        result = 31 * result + Arrays.hashCode(getStocks());
        return result;
    }
}

