package com.tiMorpheus.Facade;

import javax.ejb.Stateless;

@Stateless
public class LoanService {
    public boolean checkCreditRating(long id , double amount){
        // check if client has right on current amount
        return true;
    }
}
