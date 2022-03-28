package com.company;

import java.util.List;
import java.util.Set;
import java.util.Vector;

public class Person {
   private String name;
   private String UID;
   private String address;
   private List<Debit> debit_accts;
   private Set<Savings> saving_accts;
   private List<Account> accounts = new Vector<>();
   private List<Statement> statements_history = new Vector<>();


   public void AddAccount(Account a){
      accounts.add(a);
   }

   public void AddStatement(Statement s){
      statements_history.add(s);
   }

   public List<Account> getAccounts() {
      return accounts;
   }


   @Override
   public String toString() {
      return "Person{" +
              "accounts=" + accounts +
              ", statements_history=" + statements_history +
              '}';
   }
}
