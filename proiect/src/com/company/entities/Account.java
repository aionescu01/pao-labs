package com.company.entities;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

public class Account extends Person {
    private double balance;
    private LocalDate opening_date;
    private static int number_of_accounts=1000;
    private int id;
    private static final String bank= "ING";
    //sa adaug id ul contului ca sa se poata da la tranzactii

    public Account() {
        super();
    }

    public Account(Account a) {
        super(a);
        this.balance=a.balance;
        this.opening_date=a.opening_date;
        this.id=number_of_accounts;
        number_of_accounts++;
    }

    public Account(Person p,double balance, LocalDate opening_date) {
        super(p);
        this.balance = balance;
        this.opening_date = opening_date;
        this.id=number_of_accounts;
        number_of_accounts++;
    }

    public Account(String name, String UID, String address, double balance, LocalDate opening_date) {
        super(name, UID, address);
        this.balance = balance;
        this.opening_date = opening_date;
        this.id=number_of_accounts;
        number_of_accounts++;
    }

    public static int getNumber_of_accounts() {
        return number_of_accounts;
    }

    public static void setNumber_of_accounts(int number_of_accounts) {
        Account.number_of_accounts = number_of_accounts;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
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

    public String getBank(){ return bank;}

    public Statement doStatement()
    {
        System.out.println("statement");
        return null;
    }

//    public Transaction AddFunds(Transaction t,double sum, String Bank) {
//        balance += sum;
//        t.setSum(sum);
//        t.setTransaction("Added the sum of " + sum + " to account on the date " + LocalDate.now() + " " + LocalTime.now() + " from bank " + Bank +
//                ", account balance = " + balance);
//        return t;
//    }
//
//    public Person getperson(){
//        Person p = new Person(this.getName(),this.getUID(),this.getAddress());
//        p.setPerson_id(this.getPerson_id()-1);
//        p.setNumber_of_people(Person.getNumber_of_people()-1);
//        return p;
//    }


    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                ", opening_date=" + opening_date +
                ", id=" + id +
                '}';
    }
}
