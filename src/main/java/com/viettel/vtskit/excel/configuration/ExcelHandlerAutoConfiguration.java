package com.viettel.vtskit.excel.configuration;

import com.viettel.vtskit.excel.ExcelHandlerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(ExcelHandlerProperties.class)
public class ExcelHandlerAutoConfiguration {

    private ExcelHandlerProperties excelHandlerProperties;

    @Bean
    public ExcelHandlerService handlerService(){
        return new ExcelHandlerService();
    }

    @Autowired
    public void setExcelHandlerProperties(ExcelHandlerProperties excelHandlerProperties) {
        this.excelHandlerProperties = excelHandlerProperties;
    }
}
