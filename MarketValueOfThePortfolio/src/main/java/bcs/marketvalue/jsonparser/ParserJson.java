package bcs.marketvalue.jsonparser;


import java.io.BufferedReader;
import java.util.stream.Collectors;

public class ParserJson {
    private BufferedReader in;
    private String jsonStr;

    public ParserJson(BufferedReader in) {
        jsonStr = in.lines().collect(Collectors.joining());
        System.out.println(jsonStr);
    }
}
