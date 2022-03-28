package com.company.services;

import com.company.entities.Savings;
import com.company.entities.Savings;

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
