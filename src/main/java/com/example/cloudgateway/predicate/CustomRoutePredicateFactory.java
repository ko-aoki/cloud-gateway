package com.example.cloudgateway.predicate;

import org.springframework.cloud.gateway.handler.predicate.AbstractRoutePredicateFactory;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.web.server.ServerWebExchange;

import javax.validation.constraints.NotNull;
import java.util.function.Predicate;

public class CustomRoutePredicateFactory extends AbstractRoutePredicateFactory<CustomRoutePredicateFactory.Config> {

    public CustomRoutePredicateFactory() {
        super(Config.class);
    }

    @Override
    public Predicate<ServerWebExchange> apply(Config config) {
        // grab configuration from Config object
        return exchange -> {
            //grab the request
            ServerHttpRequest request = exchange.getRequest();
            //take information from the request to see if it
            //matches configuration.
//            return matches(config, request);
            System.out.println(config.getTestStr());
            return true;
        };
    }

    public static class Config {
        //Put the configuration properties for your filter here
        @NotNull
        private String testStr;

        public String getTestStr() {
            return testStr;
        }

        public Config setTestStr(String testStr) {

            this.testStr = testStr;
            return this;
        }
    }

}