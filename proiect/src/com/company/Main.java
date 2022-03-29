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
        Account a3 = new Account(alex,1000, LocalDate.now().minusMonths(7));
        Debit d = new Debit(a2, "Silver");
        Savings s = new Savings(a3, 6, 1.6);
        Savings c = new Savings(a3, 12, 1.9);

        Debit tea = new Debit(a2,"Gold");
        Transaction tr = new Transaction(tea);
        Transaction trd = new Transaction(d);

//        Card card = new Card(alex,a2);
//        Card card2 = new Card(alex,a2);
//        System.out.println(card.getCard_holder());
//        System.out.println(card.getAccount());
//        System.out.println(card.getCard_number());
//        System.out.println(Card.getUsed_numbers());
//        System.out.println(Card.getAccount_ids());



        PersonService personService = PersonService.getInstance();
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

        personService.AddAccount(alex,s);

        //adding funds
        tr = new Transaction(s);
        personService.AddTransaction(alex,savingsService.AddFunds(s,tr,15));

        //withdrawing funds
        tr = new Transaction(tea);
        personService.AddTransaction(alex,savingsService.WithdrawFunds(s,tr,50));

        //sending funds
        trd = new Transaction(d);
        tr = new Transaction(tea);
        for(Transaction i : savingsService.SendFunds(s,d,tr,trd,5))
            personService.AddTransaction(alex,i);


        //System.out.println(alex.getTransaction_history());
        personService.AddStatement(alex,savingsService.doStatement(s));




        //personService.AddStatement(alex,tea.doStatement());
        //System.out.println(alex.getStatements_history());
//        personService.AddAccount(alex,tea);
//
//        //adding funds
//        tr = new Transaction(tea);
//        personService.AddTransaction(alex,debitService.AddFunds(tea,tr,15,"ING"));
//
//        //withdrawing funds
//        tr = new Transaction(tea);
//        personService.AddTransaction(alex,debitService.WithdrawFunds(tea,tr,50,"BCR"));
//
//        //sending funds
//        trd = new Transaction(d);
//        tr = new Transaction(tea);
//        for(Transaction i : debitService.SendFunds(tea,d,tr,trd,5))
//        personService.AddTransaction(alex,i);
//
//
//        //System.out.println(alex.getTransaction_history());
//        personService.AddStatement(alex,debitService.doStatement(tea));
//        personService.AddStatement(alex,debitService.doStatement(d));
//        personService.AddAccount(alex,d);
//
//        personService.AddAccount(alex,c);
//        personService.AddAccount(alex,s);

        //System.out.println(alex);
        // System.out.println(alex);
//        System.out.println(alex.getStatements_history());
//        System.out.println(alex.getTransaction_history());

    }
}