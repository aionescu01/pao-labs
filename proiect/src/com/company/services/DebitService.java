package com.company.services;

import com.company.entities.Debit;


import java.util.ArrayList;
import java.util.List;

public class DebitService {
    private List<Debit> debit_accts = new ArrayList<>();
    private static DebitService instance;

    private DebitService(){}

    public static DebitService getInstance(){
        if(instance==null){
            instance=new DebitService();
        }
        return instance;
    }

    public List<Debit> getdebit_accts(){
        return new ArrayList<>(this.debit_accts);
    }

    public Debit getDebitById(int id){
        Debit db = new Debit();
        for(Debit p : this.debit_accts)
            if(p.getId()==id)
                db=p;
        return db;
    }

    public void updateDebit(int id, Debit Debit){
        for(Debit p : this.debit_accts)
            if(p.getId()==id)
            {
                this.debit_accts.remove(p);
                Debit.setId(id);
                this.debit_accts.add(Debit);
                return;
            }
    }

    public void addDebit(Debit Debit){
        this.debit_accts.add(Debit);
    }

    public void deleteDebitById(int id){
        for(Debit p : this.debit_accts)
            if(p.getId()==id)
            {
                this.debit_accts.remove(p);
                return;
            }
    }

    public void deletedebit_accts(){
        this.debit_accts.clear();
    }
}
