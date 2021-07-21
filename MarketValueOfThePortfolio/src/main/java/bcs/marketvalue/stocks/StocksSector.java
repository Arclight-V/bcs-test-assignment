package bcs.marketvalue.stocks;

public class StocksSector {
    private StockVolume[]   stocks;
    private String          sector;
    private float           assertValue;
    private float           volume;
    private float           proportion;

    public StocksSector() {
    }

    public StocksSector(StockVolume[] stocks, String sector) {
        this.stocks = stocks;
        this.sector = sector;
        for (StockVolume stockVolume : stocks ) {
            volume += stockVolume.getVolume();
            assertValue += stockVolume.getAssertValue();
        }
    }

    public StockVolume[] getStocks() {
        return stocks;
    }

    public String getSector() {
        return sector;
    }

    public float getAssertValue() {
        return assertValue;
    }

    public float getVolume() {
        return volume;
    }

    public float getProportion() {
        return proportion;
    }

    public void setProportion(float proportion) {
        this.proportion = proportion;
    }
}
