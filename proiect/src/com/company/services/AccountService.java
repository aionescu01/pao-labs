package com.company.services;

import com.company.entities.Account;
import com.company.entities.Person;
import com.company.entities.Transaction;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class AccountService {
    private List<Account> Accounts = new ArrayList<>();
    private static AccountService instance;

    private AccountService(){}

    public static AccountService getInstance(){
        if(instance==null){
            instance=new AccountService();
        }
        return instance;
    }

    public Transaction AddFunds(Account a, Transaction t, double sum, String Bank) {
        a.setBalance(a.getBalance()+sum);
        t.setSum(sum);
        t.setTransaction("Added the sum of " + sum + " to account on the date " + LocalDate.now() + " " + LocalTime.now() + " from bank " + Bank +
                ", account balance = " + a.getBalance());
        return t;
    }

    public Person getperson(Account a){
        Person p = new Person(a.getName(),a.getUID(),a.getAddress());
        p.setPerson_id(a.getPerson_id()-1);
        Person.setNumber_of_people(Person.getNumber_of_people()-1);
        return p;
    }




    public List<Account> getAccounts(){
        return new ArrayList<>(this.Accounts);
    }

    public Account getAccountById(int id){
        Account ac = new Account();
        for(Account p : this.Accounts)
            if(p.getId()==id)
                ac=p;
        return ac;
    }

    public void updateAccount(int id, Account Account){
        for(Account p : this.Accounts)
            if(p.getId()==id)
            {
                this.Accounts.remove(p);
                Account.setId(id);
                this.Accounts.add(Account);
                return;
            }
    }

    public void addAccount(Account Account){
        this.Accounts.add(Account);
    }

    public void deleteAccountById(int id){
        for(Account p : this.Accounts)
            if(p.getId()==id)
            {
                this.Accounts.remove(p);
                return;
            }
    }

    public void deleteAccounts(){
        this.Accounts.clear();
    }

}
