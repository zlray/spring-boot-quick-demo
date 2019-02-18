package com.zl.springbootquickdemo;

import com.zl.springbootquickdemo.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * SpringBoot单元测试
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootQuickDemoApplicationTests {

    @Autowired
    Person person;

    Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    public void contextLoads() {
        System.out.println(person);

        //日志的级别 由低到高  trace debug info warn error
        logger.trace("trace日志"); //跟踪
        logger.debug("debug日志"); //调试
        logger.info("info日志"); //信息
        logger.warn("warn日志"); //警告
        logger.error("error日志"); //错误
    }
}

