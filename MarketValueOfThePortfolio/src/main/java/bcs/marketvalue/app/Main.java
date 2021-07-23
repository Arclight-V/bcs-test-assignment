package bcs.marketvalue.app;

import bcs.marketvalue.config.MarketValueApplicationConfig;
import bcs.marketvalue.server.Server;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MarketValueApplicationConfig.class);
        Server server = context.getBean(Server.class);
        try {
            server.start(8080);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
