package com.gsww.converter;

import org.springframework.core.convert.converter.Converter;

public class DataTrimConverter implements Converter<String ,String> {
    /*将request请求中的String类型的数据首位的空格去掉*/
    @Override
    public String convert(String s) {
        return s.trim();
    }
}