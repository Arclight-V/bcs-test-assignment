package bcs.marketvalue.stocks;

public class Stock {
    private String      tickerSymbol;
    private String      sector;
    private float       value;

    public Stock() {
    }

    public Stock(String tickerSymbol, String sector, float value) {
        this.tickerSymbol = tickerSymbol;
        this.sector = sector;
        this.value = value;
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
}