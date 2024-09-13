package com.banktransaction;


public class AccountService {

    public void debit(double amount) {
        // Simulate debit transaction
        performCalculation();
    }

    public void credit(double amount) {
        // Simulate credit transaction
        performCalculation();
    }

    private void performCalculation() {
        // Simulate intensive CPU calculations
        double result = MathUtil.performHeavyComputation();
    }
}
