package com.company;

import java.time.LocalDate;

public class Account extends Person {
    double balance;
    LocalDate opening_date;
    String owner_name;
    static int number_of_accounts_open=0;
    public static final String bank= "ING";
    //sa adaug id ul contului ca sa se poata da la tranzactii
    public Account(double balance, String owner_name, LocalDate date) {
        this.balance = balance;
        this.owner_name = owner_name;
        number_of_accounts_open++;
        this.opening_date = date;
    }

    public Account() {
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public LocalDate getOpening_date() {
        return opening_date;
    }

    public void setOpening_date(LocalDate opening_date) {
        this.opening_date = opening_date;
    }

    public String getOwner_name() {
        return owner_name;
    }

    public void setOwner_name(String owner_name) {
        this.owner_name = owner_name;
    }

    public static int getNumber_of_accounts_open() {
        return number_of_accounts_open;
    }

    public Statement doStatement()
    {
        System.out.println("statement");
        return null;
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                ", opening_date=" + opening_date +
                ", owner_name='" + owner_name + '\'' +
                '}';
    }
}
