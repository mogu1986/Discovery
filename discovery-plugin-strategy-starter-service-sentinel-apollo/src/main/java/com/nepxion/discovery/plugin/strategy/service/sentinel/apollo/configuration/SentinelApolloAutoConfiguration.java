package com.nepxion.discovery.plugin.strategy.service.sentinel.apollo.configuration;

/**
 * <p>Title: Nepxion Discovery</p>
 * <p>Description: Nepxion Discovery</p>
 * <p>Copyright: Copyright (c) 2017-2050</p>
 * <p>Company: Nepxion</p>
 * @author Weihua Wang
 * @author Haojun Ren
 * @version 1.0
 */

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nepxion.discovery.plugin.strategy.service.sentinel.apollo.loader.SentinelApolloRuleLoader;
import com.nepxion.discovery.plugin.strategy.service.sentinel.constant.SentinelStrategyConstant;
import com.nepxion.discovery.plugin.strategy.service.sentinel.loader.SentinelRuleLoader;

@Configuration
@ConditionalOnProperty(value = SentinelStrategyConstant.SPRING_APPLICATION_STRATEGY_SENTINEL_ENABLED, matchIfMissing = false)
public class SentinelApolloAutoConfiguration {
    @Bean
    public SentinelRuleLoader sentinelRuleLoader() {
        return new SentinelApolloRuleLoader();
    }
}