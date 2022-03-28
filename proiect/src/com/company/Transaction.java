package com.company;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

public class Transaction {
    private Account account;
    private Debit debit = new Debit();
    private Savings savings = new Savings();
    private String transaction="";
    private double sum;
    private int destination_id;//contul destinatie

    public Transaction(Account acc){
        this.account=acc;
    }


    public void AddFunds(double sum, String Bank){
            if(this.account.getClass()==debit.getClass()){
                Debit d = (Debit)this.account;
            double fee;
            if (!Objects.equals(Bank, d.bank))
                if (Objects.equals(d.getAccount_type(), "Gold"))
                    fee = 2;
                else fee = 5;
            else fee = 0;
            d.balance += sum - fee;
            transaction=("Added the sum of " + sum + " to debit account on the date " + LocalDate.now() + " " + LocalTime.now() + " from bank " + Bank + " with fee " + fee + ", account balance = " + d.balance);

        }
        else if(this.account.getClass()==savings.getClass())
        {
            System.out.println("bbb");
        }
    }

    public String getTransaction() {
        return transaction;
    }


    //metoda add funds, withdraw funds, send funds, receive funds
}
