package com.company.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Objects;

public class Savings extends Account {
    private int period;
    private double interest_rate;
    private double[] balance_history;

    public Savings() {
    }

    public Savings(Account a, int period, double interest_rate) {
        super(a);
        this.period = period;
        this.interest_rate = interest_rate;
        this.balance_history = new double[1];
        this.balance_history[0] = this.getBalance();
        AddAccount(this);
    }

    public Savings(Person p, double balance, LocalDate opening_date, int period, double interest_rate) {
        super(p, balance, opening_date);
        this.period = period;
        this.interest_rate = interest_rate;
        this.balance_history = new double[1];
        this.balance_history[0] = this.getBalance();
        AddAccount(this);
    }

    public Savings(String name, String UID, String address, double balance, LocalDate opening_date, int period, double interest_rate) {
        super(name, UID, address, balance, opening_date);
        this.period = period;
        this.interest_rate = interest_rate;
        this.balance_history = new double[1];
        this.balance_history[0] = this.getBalance();
        AddAccount(this);
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public double getInterest_rate() {
        return interest_rate;
    }

    public void setInterest_rate(double interest_rate) {
        this.interest_rate = interest_rate;
    }

    public double[] getBalance_history() {
        return balance_history;
    }

    public void setBalance_history(double[] balance_history) {
        this.balance_history = balance_history;
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
        setBalance(getBalance()+sum);
        t.setSum(sum);
        t.setTransaction("Added the sum of " + sum + " to debit account on the date " + LocalDate.now() + " " + LocalTime.now() + " from bank " + Bank  +
                ", account balance = " + getBalance());
        t.setDate(LocalDateTime.now());
        AddTransaction(t);
        return t;
    }





    @Override
    public String toString() {
        return "Savings{" +
                "balance=" + getBalance() +
                ", opening_date=" + getOpening_date() +
                ", period=" + period +
                ", interest_rate=" + interest_rate +
                ", balance_history=" + Arrays.toString(balance_history) +
                '}';
    }
}
