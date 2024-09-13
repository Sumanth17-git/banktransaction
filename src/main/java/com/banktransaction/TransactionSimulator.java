package com.banktransaction;

public class TransactionSimulator {

    public static void main(String[] args) {
        System.out.println("Starting Bank Transaction Simulation...");

        // Simulate processing of transactions in multiple threads
        for (int i = 0; i < 6; i++) {
            new Thread(new TransactionProcessor(), "TransactionThread-" + i).start();
        }
    }
}
