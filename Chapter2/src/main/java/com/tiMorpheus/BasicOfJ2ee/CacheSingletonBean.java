package com.tiMorpheus.BasicOfJ2ee;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import java.util.HashMap;
import java.util.Map;

/**
 * Демонстрирует, как сделать из POJO компонент-одиночку, экземпляр которого созается и инициализируется при запуске
 * а затем управляется контейнером, простым добавлением аннотаций @Singleton and @Startup к классу и @PostConstruct к
 * методу инициализации.
 *
 */

@Singleton
public class CacheSingletonBean {

    private Map<Integer, String> myCache;

    @PostConstruct
    public void start(){
        myCache = new HashMap<Integer, String>();
    }

    public void addUser(Integer id , String name){
        myCache.put(id, name);
    }

    public String getName(Integer id){
        return myCache.get(id);
    }

}
