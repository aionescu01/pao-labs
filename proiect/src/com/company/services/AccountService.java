package com.company.services;

import com.company.entities.Account;

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
