package bcs.marketvalue.stocks;

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
}