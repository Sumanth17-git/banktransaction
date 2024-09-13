package com.banktransaction;


public class TransactionProcessor implements Runnable {

    @Override
    public void run() {
        TransactionService transactionService = new TransactionService();
        
        while (true) {
            // Simulate transaction processing
            transactionService.processTransaction();
        }
    }
}
