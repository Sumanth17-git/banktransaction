package com.banktransaction;


public class TransactionService {

    private AccountService accountService = new AccountService();

    public void processTransaction() {
        double amount = MathUtil.generateRandomAmount();
        
        accountService.debit(amount);
        accountService.credit(amount);
    }
}
