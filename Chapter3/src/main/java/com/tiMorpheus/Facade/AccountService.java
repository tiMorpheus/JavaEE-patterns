package com.tiMorpheus.Facade;


import javax.ejb.Stateless;

@Stateless
public class AccountService {
    public boolean getLoan(double amount){
        //check money
        return true;
    }
    
    public boolean setCustomerBalance(long id, double amount){
        // set new balance
        return true;
    }

}

