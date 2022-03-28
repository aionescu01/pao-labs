package com.company;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

//clasa de tip person care are lista de conturi, poate sa fie lista asta sortata dupa tipul contului
        //sau sa fie o lista de conturi de debit si una de savings, si alea de savings sa fie sortate dupa cate luni e perioada


        Account a1 = new Account(100, "Alex Ionescu", LocalDate.now());
        Account a2 = new Account(50, "Aaa aaa", LocalDate.now());
        Debit d = new Debit(100, "Alex Ionescu", LocalDate.now(), "Silver");
        Savings s = new Savings(100, "Mihaita Dragan", LocalDate.now(), 6, 1.6);
        Savings c = new Savings(75, "Horatiu Cheval", LocalDate.now(), 12, 1.9);

        Person p = new Person();
        Account tea = new Debit(500,"Ana Stan",LocalDate.now(),"Gold");
//        p.AddStatement(tea.doStatement());
//        System.out.println(p);
        Transaction tr = new Transaction(tea);
        System.out.println(tea.getBalance());
        tr.AddFunds(15,"ING");
        System.out.println(tea.getBalance());
        //System.out.println(((Debit) tea).getAccount_type());


//        d.AddFunds(15,"BCR");
//        d.WithdrawFunds(100,"ING");
//        Statement st = new Statement(d);
//        System.out.println(st);
//        d.getStatement();

//        s.WithdrawFunds(10, "");
//        s.AddFunds(5, "");
//        //s.getStatement();
//        StatementInterface.statements.add(s);
//        StatementInterface.statements.add(c);
//        for (StatementInterface i : StatementInterface.statements) {
//            System.out.println(i);
//            i.getStatement();
//        }
//        System.out.println(d);
//        System.out.println(s);
//        System.out.println(d.getBalanceStatement());
//        System.out.println(Account.getNumber_of_accounts_open());
    }
}
