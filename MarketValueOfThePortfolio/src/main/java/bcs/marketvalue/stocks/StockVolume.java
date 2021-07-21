package bcs.marketvalue.stocks;

public class StockVolume {
    private Stock stock;
    private float volume;
    private float assertValue;
    private float proportion;

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

    public float getProportion() {
        return proportion;
    }

    public void setProportion(float proportion) {
        this.proportion = proportion;
    }
}