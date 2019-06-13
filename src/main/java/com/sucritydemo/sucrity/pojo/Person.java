package com.sucritydemo.sucrity.pojo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.Map;

@Data
@Component
@PropertySource(value = {"classpath:person.properties"})
@ConfigurationProperties(prefix = "person")
public class Person {
    private String name;
    private Date brithday;
    private int age;
    private Dog dog;
    private Map map;

}
