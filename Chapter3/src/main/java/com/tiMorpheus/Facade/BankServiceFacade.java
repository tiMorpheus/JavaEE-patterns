package com.tiMorpheus.Facade;

import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class BankServiceFacade {

    @Inject
    CustomerService customerService;

    @Inject
    LoanService loanService;

    @Inject
    AccountService accountService;

    public boolean getLoan(int sessionId, double amount) {
        boolean result = false;
        long id = customerService.getCustomer(sessionId);

        if (customerService.chechId(id)) {
            if (loanService.checkCreditRating(id, amount)) {
                if (accountService.getLoan(amount)) {
                    result = accountService.setCustomerBalance(id, amount);
                }
            }
        }
        return result;
    }
}
