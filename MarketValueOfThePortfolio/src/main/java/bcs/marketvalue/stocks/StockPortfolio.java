package bcs.marketvalue.stocks;

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

    public float getAssertValue() {
        return assertValue;
    }
}

