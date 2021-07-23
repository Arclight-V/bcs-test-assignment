package bcs.marketvalue.jsonparser;


import bcs.marketvalue.stocks.StockVolume;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class ParserJson {
    private String  in;
    private JSONObject jsonObject;
    private JSONArray jsonArray;
    private String          errorString;
    private List<String>    stockList;

    public ParserJson(String in) {
        this.in = in;
        stockList = new ArrayList<String>();
    }

    public void searchStocks() {
        jsonObject = new JSONObject(in);
        if (jsonObject.get("stocks") == null) {
            errorString = "The stocks token in missing";
            return;
        }
        jsonArray = (JSONArray)jsonObject.get("stocks");
        for (int i=0; i < jsonArray.length(); i++) {
            System.out.println(jsonArray.getJSONObject(i));
        }
    }

    public String getErrorString() {
        return errorString;
    }


}
