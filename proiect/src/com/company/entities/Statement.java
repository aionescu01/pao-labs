package com.company.entities;

import java.time.LocalDate;
import java.time.LocalTime;

public class Statement {
    private Account account;
    private Debit debit;
    private Savings savings;
    private String statement = "";
    private int id;
    private static int number_of_statements=1;

    public Statement(){}

    public Statement(Account account) {
        this.account = account;
        this.id=number_of_statements;
        number_of_statements++;
    }

    public Statement(Debit debit) {
        this.debit = debit;//sa pot sa dau get la contul pt care s a facut statementul
        this.statement = this.statement + "-----------------STATEMENT-------------------\n" + debit.getBank() + " BANK\n" + "Debit account of " +
                debit.getName() + "\nStatement made on the date: " + LocalDate.now() + " " + LocalTime.now() + "\nCurrent balance = " + debit.getBalance()
                + "\nPast transactions below:\n";
        //System.out.println(debit.getTransaction_history());
        for (Transaction i : debit.getTransaction_history()) {
//            System.out.println("a");
//            System.out.println(i);
            this.statement = this.statement + i.getTransaction() + "\n";
        }
        this.statement = this.statement + "--------------END OF STATEMENT---------------";
        this.id=number_of_statements;
        number_of_statements++;
    }

    public Statement(Savings savings) {
        this.savings = savings;
        this.id=number_of_statements;
        number_of_statements++;
    }


    @Override
    public String toString() {
        return "Statement{" +
                statement +
                '}';
    }

    public String getStatement() {
        return statement;
    }

    public void setStatement(String statement) {
        this.statement = statement;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
