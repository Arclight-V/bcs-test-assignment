package bcs.marketvalue.stocks;

public class Stock {
    private String      tickerSymbol;
    private String      sector;
    private float       value;
    private float       volume;

    public Stock(String tickerSymbol, String sector, float value, float volume) {
        this.tickerSymbol = tickerSymbol;
        this.sector = sector;
        this.value = value;
        this.volume = volume;
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

    public float getVolume() {
        return volume;
    }
}