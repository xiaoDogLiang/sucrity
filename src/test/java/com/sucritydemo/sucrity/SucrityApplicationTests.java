package com.sucritydemo.sucrity;

import com.sucritydemo.sucrity.pojo.Person;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SucrityApplicationTests {

    @Autowired
    Person person;

    @Autowired
    ApplicationContext ioc;


    @Test
    public void contextLoads() {
        System.out.println(person);
    }

    @Test
    public void testHellService() {
        boolean b = ioc.containsBean("helloService");
        ioc.getEnvironment();
        System.out.println(b);
        Logger logger = LoggerFactory.getLogger(getClass());
        logger.trace("trace");
        logger.debug("debug");
        logger.info("info--Springboot默认基本");
        logger.warn("warn");
        logger.error("error");
    }


}
