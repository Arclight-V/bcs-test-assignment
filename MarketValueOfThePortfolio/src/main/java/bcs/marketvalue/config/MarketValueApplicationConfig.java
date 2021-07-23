package bcs.marketvalue.config;

import bcs.marketvalue.server.Server;
import org.springframework.context.annotation.Bean;
public class MarketValueApplicationConfig {
    @Bean
    public Server server() {
        return new Server();
    }
}
