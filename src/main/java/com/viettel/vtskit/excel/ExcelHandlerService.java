package com.viettel.vtskit.excel;

import com.viettel.vtskit.excel.configuration.ConstantConfiguration;
import com.viettel.vtskit.excel.configuration.ExcelHandlerProperties;
import org.springframework.beans.factory.annotation.Autowired;

public class ExcelHandlerService {

    private ExcelHandlerProperties excelHandlerProperties;

    public String exampleFunction(String name){
        return String.format(ConstantConfiguration.GREETING_MESSAGE, name);
    }

    @Autowired
    public void setExcelHandlerProperties(ExcelHandlerProperties excelHandlerProperties) {
        this.excelHandlerProperties = excelHandlerProperties;
    }
}
