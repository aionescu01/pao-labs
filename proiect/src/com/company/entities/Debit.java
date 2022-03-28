package com.company.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Objects;

public class Debit extends Account {
    private String account_type;
    //cont tip gold silver

    public Debit() {
    }

    public Debit(Account account, String account_type) {
        super(account);
        this.account_type=account_type;
        AddAccount(this);
    }

    public Debit(Person p, double balance, LocalDate opening_date, String account_type) {
        super(p, balance, opening_date);
        this.account_type = account_type;
        AddAccount(this);

    }

    public Debit(String name, String UID, String address, double balance, LocalDate opening_date, String account_type) {
        super(name, UID, address, balance, opening_date);
        this.account_type = account_type;
        AddAccount(this);
    }

    public String getAccount_type() {
        return account_type;
    }

    public void setAccount_type(String account_type) {
        this.account_type = account_type;
    }

    @Override
    public Statement doStatement() {
        System.out.println("-----------------STATEMENT-------------------");
        System.out.println(getBank() + " BANK");
        System.out.println("Debit account of " + getName());
        System.out.println("Statement made on the date: " + LocalDate.now() + " " + LocalTime.now());
        System.out.println("Current balance = " + getBalance());
        System.out.println("Past transactions below: ");
        for (Transaction i : getTransaction_history())
            System.out.println(i.getTransaction());
        System.out.println("--------------END OF STATEMENT---------------");
        return new Statement(this);
    }



    @Override
    public Transaction AddFunds(Transaction t,double sum, String Bank) {
        double fee;
        if (!Objects.equals(Bank, getBank()))
            if (Objects.equals(getAccount_type(), "Gold"))
                fee = 2;
            else fee = 5;
        else fee = 0;
        double x = getBalance();
        setBalance(x+sum-fee);
        t.setSum(sum);
        t.setTransaction("Added the sum of " + sum + " to debit account on the date " + LocalDate.now() + " " + LocalTime.now() + " from bank " + Bank + " with fee " + fee +
                ", account balance = " + getBalance());
        t.setDate(LocalDateTime.now());
        AddTransaction(t);
        return t;
    }
//
//    public void WithdrawFunds(double sum, String Bank) {
//        double fee;
//        if (!Objects.equals(Bank, bank))
//            if (Objects.equals(account_type, "Gold"))
//                fee = 2;
//            else fee = 5;
//        else fee = 0;
//        balance -= sum - fee;
//        transactions.add("Withdrawn the sum of " + sum + " from debit account on the date " + LocalDate.now() + " " +
//                LocalTime.now() + " from bank " + Bank + " with fee " + fee + ", account balance = " + balance);
//    }



    @Override
    public String toString() {
        return "Debit{" +
                "balance=" + getBalance() +
                ", opening_date=" + getOpening_date() +
                ", account_type='" + account_type + '\'' +
                '}';
    }


}
