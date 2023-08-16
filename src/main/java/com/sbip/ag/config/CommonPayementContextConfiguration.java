package com.sbip.ag.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(CommonApplicationContextConfiguration.class)//Import a config inside another config
public class CommonPayementContextConfiguration {

}
