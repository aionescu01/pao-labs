package com.company;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

public class Debit extends Account implements StatementInterface, TransactionInterface {
    private String account_type;
    //cont tip gold silver

    public Debit(double balance, String owner_name, LocalDate date, String account_type) {
        super(balance, owner_name, date);
        this.account_type = account_type;
    }

    public Debit() {
    }

    public Debit(Account account) {
    }

    @Override
    public String toString() {
        return "Debit{" +
                "balance=" + balance +
                ", opening_date=" + opening_date +
                ", owner_name='" + owner_name + '\'' +
                ", account_type='" + account_type + '\'' +
                '}';
    }

    public void AddFunds(double sum, String Bank) {
            }

    public void WithdrawFunds(double sum, String Bank) {
        double fee;
        if (!Objects.equals(Bank, bank))
            if (Objects.equals(account_type, "Gold"))
                fee = 2;
            else fee = 5;
        else fee = 0;
        balance -= sum - fee;
        transactions.add("Withdrawn the sum of " + sum + " from debit account on the date " + LocalDate.now() + " " + LocalTime.now() + " from bank " + Bank + " with fee " + fee + ", account balance = " + balance);
    }

    public void getStatement() {

    }

    @Override
    public Statement doStatement() {
        System.out.println("-----------------STATEMENT-------------------");
        System.out.println(bank + " BANK");
        System.out.println("Debit account of " + owner_name);
        System.out.println("Statement made on the date: " + LocalDate.now() + " " + LocalTime.now());
        System.out.println("Current balance = " + balance);
        System.out.println("Past transactions below: ");
        for (String i : transactions)
            System.out.println(i);
        System.out.println("--------------END OF STATEMENT---------------");
        return new Statement(this);
    }

    public void getTransactions() {
        System.out.println(transactions);
    }

    public String getAccount_type() {
        return account_type;
    }
}
