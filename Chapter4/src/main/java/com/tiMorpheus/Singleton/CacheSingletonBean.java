package com.tiMorpheus.Singleton;


import javax.annotation.PostConstruct;
import javax.ejb.*;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

@Startup
@DependsOn("MyLoggingBean")
@ConcurrencyManagement(ConcurrencyManagementType.CONTAINER)
@Singleton
@AccessTimeout(value = 120_000)
public class CacheSingletonBean {

    private Map<Integer, String> myCache;

    @EJB
    MyLoggingBean loggingBean;

    @PostConstruct
    public void start(){
        Logger.getLogger("MyGlobalLogger").info("Started");
        myCache = new HashMap<>();
    }

    @AccessTimeout(value = 30, unit = TimeUnit.SECONDS)
    @Lock(LockType.WRITE)
    public void addUser(Integer id, String name){
        myCache.put(id, name);
    }

    @Lock(LockType.READ)
    public String getName(Integer id){
        return  myCache.get(id);
    }

}
