package com.hk.rislevelsvc.core.a;

import lombok.extern.slf4j.Slf4j;
import org.apache.log4j.PropertyConfigurator;

import java.util.logging.Logger;

/**
 * @author zhangxi
 */
//@Slf4j
public class Log4jDemo {
    private static final Logger logger = Logger.getLogger(Log4jDemo.class.getName());

    public static void main(String[] args){
        PropertyConfigurator.configure("config/Log4j.properties");
        logger.info("this is info message");
    }
}
