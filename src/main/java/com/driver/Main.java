package com.driver;

public class Main {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount("pt", 50000, 2000);
        
        try {
            System.out.println(bankAccount.generateAccountNumber(5, 40));
        }catch (Exception exception){
            System.out.println(exception.toString());
        }
        //        System.out.println("Bank Account Done");

        CurrentAccount currentAccount = new CurrentAccount("meet", 50000, "bghdnliu");
        try {
            currentAccount.validateLicenseId();
            System.out.println(currentAccount.tradeLicenseId);
        }catch (Exception exception) {
            System.out.println(exception.toString());
        }
    }
}