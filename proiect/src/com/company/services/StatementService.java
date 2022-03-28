package com.company.services;

import com.company.entities.Statement;


import java.util.ArrayList;
import java.util.List;

public class StatementService {
    private List<Statement> statements = new ArrayList<>();
    private static StatementService instance;

    private StatementService(){}

    public static StatementService getInstance(){
        if(instance==null){
            instance=new StatementService();
        }
        return instance;
    }

    public List<Statement> getstatements(){
        return new ArrayList<>(this.statements);
    }

    public Statement getStatementById(int id){
        Statement st = new Statement();
        for(Statement p : this.statements)
            if(p.getId()==id)
                st=p;
        return st;
    }

    public void updateStatement(int id, Statement Statement){
        for(Statement p : this.statements)
            if(p.getId()==id)
            {
                this.statements.remove(p);
                Statement.setId(id);
                this.statements.add(Statement);
                return;
            }
    }

    public void addStatement(Statement Statement){
        this.statements.add(Statement);
    }

    public void deleteStatementById(int id){
        for(Statement p : this.statements)
            if(p.getId()==id)
            {
                this.statements.remove(p);
                return;
            }
    }

    public void deletestatements(){
        this.statements.clear();
    }

}
