package com.tiMorpheus.Facade;

import javax.ejb.Stateless;

@Stateless
public class CustomerService {

    public long getCustomer(int sessionId){
        return 100005l;
    }

    public boolean chechId(long x){
        //check here
        return true;
    }
}
