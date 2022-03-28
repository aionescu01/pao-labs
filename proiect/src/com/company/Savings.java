package com.company;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;

public class Savings extends Account implements TransactionInterface, StatementInterface {
    private int period;
    private double interest_rate;
    private double[] balance_history;

    public Savings() {
    }

    @Override
    public String toString() {
        return "Savings{" +
                "balance=" + balance +
                ", opening_date=" + opening_date +
                ", owner_name='" + owner_name + '\'' +
                ", period=" + period +
                ", interest_rate=" + interest_rate +
                ", balance_history=" + Arrays.toString(balance_history) +
                '}';
    }

    public Savings(double balance, String owner_name, LocalDate date, int period, double interest_rate) {
        super(balance, owner_name, date);
        this.period = period;
        this.interest_rate = interest_rate;
        this.balance_history = new double[1];
        this.balance_history[0] = this.balance;
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

    public void AddFunds(double sum, String Bank){
        //aici se adauga doar daca contul de economii a fost deschis cu cel putin period luni inainte de data curenta cu un if
        int x=balance_history.length;
        double[] bal=new double[x+1];
        System.arraycopy(balance_history, 0, bal, 0, x);
        balance+=sum;
        bal[x]=balance;
        balance_history=bal;

        transactions.add("Added the sum of "+sum+" to savings account on the date " + LocalDate.now()+" "+ LocalTime.now());
    }
    public void WithdrawFunds(double sum, String Bank){
        //aici se scoate doar daca contul de economii a fost deschis cu cel putin period luni inainte de data curenta cu un if
        int x=balance_history.length;
        double[] bal=new double[x+1];
        System.arraycopy(balance_history, 0, bal, 0, x);
        balance-=sum;
        bal[x]=balance;
        balance_history=bal;

        transactions.add("Withdrawn the sum of "+sum+" from savings account on the date " + LocalDate.now()+" "+ LocalTime.now());

    }

    public void getStatement() {
        System.out.println("-----------------STATEMENT-------------------");
        System.out.println(bank+ " BANK");
        System.out.println("Savings account of "+owner_name);
        System.out.println("Statement made on the date: "+ LocalDate.now()+" "+ LocalTime.now());
        System.out.println("Current balance = " + balance);
        System.out.println("\nPast transactions below: ");
        for(String i : transactions)
            System.out.println(i);
        System.out.println("\nBalance history below: ");
        for(double i : balance_history)
            System.out.println(i);
        System.out.println("--------------END OF STATEMENT---------------");
    }

    public void getTransactions(){
        System.out.println(transactions);
    }
}
