package com.example.cloudgateway;

import com.example.cloudgateway.predicate.CustomRoutePredicateFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 追加の設定クラス.
 * @see <a href="https://github.com/spring-cloud/spring-cloud-gateway/blob/master/spring-cloud-gateway-core/src/main/java/org/springframework/cloud/gateway/config/GatewayAutoConfiguration.java">参考</a>
 */
@Configuration
public class CustomConfig {

    @Bean
    public CustomRoutePredicateFactory customRoutePredicateFactory() {
        return new CustomRoutePredicateFactory();
    }
}
