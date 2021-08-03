package bcs.marketvalue.jsonparser;


import bcs.marketvalue.stocks.Stock;
import bcs.marketvalue.stocks.StockVolume;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ParserJson {
    private JSONObject      jsonObject;
    private JSONArray       jsonArray;
    private String          errorString;
    private StockVolume[]   stockVolumes;

    public ParserJson(String in) {
        jsonObject = new JSONObject(in);
    }

    public StockVolume[] searchStocks() {
        if ((jsonArray = (JSONArray)jsonObject.get("stocks")) == null) {
            errorString = "The stocks token in missing";
            return null;
        }
        stockVolumes = new StockVolume[jsonArray.length()];
        for (int i=0; i < jsonArray.length(); i++) {
//            System.out.println(jsonArray.get(i));
            JSONObject jo = jsonArray.getJSONObject(i);
            stockVolumes[i] = new StockVolume(new Stock(jo.getString("symbol")), jo.getFloat("volume"));
        }
        for (StockVolume sv : stockVolumes) {
            System.out.println(sv);
        }
        return null;
    }

    public String getErrorString() {
        return errorString;
    }


}
