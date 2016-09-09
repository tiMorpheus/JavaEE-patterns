package com.tiMorpheus.Singleton;


import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import java.util.logging.Logger;

@Startup
@Singleton
public class MyLoggingBean {

    private Logger logger;

    @PostConstruct
    public void start(){
        logger = Logger.getLogger("MyGlobalLogger");
        logger.info("Well, i stated first");
    }

    public void logInfo(String msg){
        logger.info(msg);
    }


}
