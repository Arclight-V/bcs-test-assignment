package bcs.marketvalue.stocks;

public class StockVolume {
    private Stock stock;
    private float volume;
    private float assertValue;

    public StockVolume(Stock stock, float volume) {
        this.stock = stock;
        this.volume = volume;
        this.assertValue = this.stock.getValue() * volume;
    }

    public Stock getStock() {
        return stock;
    }

    public float getVolume() {
        return volume;
    }

    public float getAssertValue() {
        return assertValue;
    }
}
