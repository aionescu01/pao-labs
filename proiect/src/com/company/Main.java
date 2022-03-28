package com.company;

import com.company.entities.*;
import com.company.services.*;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

//clasa de tip person care are lista de conturi, poate sa fie lista asta sortata dupa tipul contului
        //sau sa fie o lista de conturi de debit si una de savings, si alea de savings sa fie sortate dupa cate luni e perioada

        Person alex = new Person("Alexandru Ionescu","5011228","Str. Maior Coravu 55");
        Person ana = new Person("Ana Stan","6010502","Str. Maior Coravu 55");
        Account a1 = new Account(ana,100, LocalDate.now());
        Account a2 = new Account(alex,50, LocalDate.now());
        Account a3 = new Account(alex,1000, LocalDate.now());
        Debit d = new Debit(a2, "Silver");
        Savings s = new Savings(a3, 6, 1.6);
        Savings c = new Savings(a3, 12, 1.9);

        Account tea = new Debit(a2,"Gold");
        Transaction tr = new Transaction(tea);
        tea.AddFunds(tr,15,"ING");

        Card card = new Card(alex,a2);
        Card card2 = new Card(alex,a2);
        System.out.println(card.getCard_holder());
        System.out.println(card.getAccount());
        System.out.println(card.getCard_number());
        System.out.println(Card.getUsed_numbers());
        System.out.println(Card.getAccount_ids());



        PersonService computerService = PersonService.getInstance();
        DebitService debitService = DebitService.getInstance();
        SavingsService savingsService = SavingsService.getInstance();
        StatementService statementService = StatementService.getInstance();
        TransactionService transactionService = TransactionService.getInstance();
        AccountService accountService = AccountService.getInstance();
//        System.out.println(a1.getId());
//        accountService.addAccount(a1);
//        System.out.println(accountService.getAccountById(1000));


//        p.AddStatement(tea.doStatement());
//        System.out.println(p);

        //System.out.println(tea.getBalance());
        //((Debit) tea).AddFunds(tr, 15,"ING");
        //System.out.println(tea.getBalance());
        //alex.AddStatement(tea.doStatement());
        //((Debit) tea).AddFunds(tr, 15,"ING");
        //System.out.println(tea.getBalance());
        //System.out.println(((Debit) tea).getAccount_type());
       // alex.AddStatement(tea.doStatement());
        //System.out.println(alex.getStatements_history());
        //System.out.println(alex.getTransaction_history());


        //((Debit) tea).AddFunds(tr, 15,"ING");
//        alex.AddStatement(tea.doStatement());
//        System.out.println(alex.getStatements_history());
//        Transaction tr = new Transaction(tea);
//        alex.AddTransaction(tea.AddFunds(tr,15,"ING"));
//        tr = new Transaction(tea);
//        alex.AddTransaction(tea.AddFunds(tr,23,"BCR"));
//        //System.out.println(alex.getTransaction_history());
//        //alex.AddStatement(tea.doStatement());
//        alex.AddAccount(d);
//        alex.AddAccount(tea);
//        alex.AddAccount(c);
//        alex.AddAccount(s);
//        System.out.println(alex.getAccounts());
//        //System.out.println(alex.getStatements_history());


    }
}
