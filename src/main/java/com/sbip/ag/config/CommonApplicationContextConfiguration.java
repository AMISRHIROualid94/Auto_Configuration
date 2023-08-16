package com.sbip.ag.config;

import com.sbip.ag.configConditions.RelationalDatabaseCondition;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CommonApplicationContextConfiguration {

    @Bean
    @Conditional(RelationalDatabaseCondition.class)//This bean is only created when the condition evaluates it as true
    public DataSourceAutoConfiguration dataSourceAutoConfiguration(){
        return new DataSourceAutoConfiguration();
    }
}
