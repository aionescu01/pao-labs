package com.company.services;

import com.company.entities.Savings;
import com.company.entities.*;
import com.company.entities.Transaction;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;


public class SavingsService {

    private List<Savings> Savings_accts = new ArrayList<>();
    private static SavingsService instance;

    private SavingsService(){}

    public static SavingsService getInstance(){
        if(instance==null){
            instance=new SavingsService();
        }
        return instance;
    }

    PersonService personService = PersonService.getInstance();
    AccountService accountService = AccountService.getInstance();


    public Statement doStatement(Savings s) {
        System.out.println("-----------------STATEMENT-------------------");
        System.out.println(s.getBank() + " BANK");
        System.out.println("Debit account of " + s.getName());
        System.out.println("Statement made on the date: " + LocalDate.now() + " " + LocalTime.now());
        System.out.println("Current balance = " + s.getBalance());
        System.out.println("Past transactions below: ");
        for (Transaction i : s.getTransaction_history())
            System.out.println(i.getTransaction());
        System.out.println("--------------END OF STATEMENT---------------");
        return new Statement(s);
    }



    public Transaction AddFunds(Savings s,Transaction t, double sum, String Bank) {
        s.setBalance(s.getBalance()+sum);
        t.setSum(sum);
        t.setTransaction("Added the sum of " + sum + " to debit account on the date " + LocalDate.now() + " " + LocalTime.now() + " from bank " + Bank  +
                ", account balance = " + s.getBalance());
        t.setDate(LocalDateTime.now());
        personService.AddTransaction(accountService.getperson(s),t);
        return t;
    }

    public List<Savings> getSavings_accts(){
        return new ArrayList<>(this.Savings_accts);
    }

    public Savings getSavingsById(int id){
        Savings sv = new Savings();
        for(Savings p : this.Savings_accts)
            if(p.getId()==id)
                sv=p;
        return sv;
    }

    public void updateSavings(int id, Savings Savings){
        for(Savings p : this.Savings_accts)
            if(p.getId()==id)
            {
                this.Savings_accts.remove(p);
                Savings.setId(id);
                this.Savings_accts.add(Savings);
                return;
            }
    }

    public void addSavings(Savings Savings){
        this.Savings_accts.add(Savings);
    }

    public void deleteSavingsById(int id){
        for(Savings p : this.Savings_accts)
            if(p.getId()==id)
            {
                this.Savings_accts.remove(p);
                return;
            }
    }

    public void deleteSavings_accts(){
        this.Savings_accts.clear();
    }
    
}
