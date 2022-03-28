package com.company;

import java.time.LocalDate;
import java.time.LocalTime;

public class Statement {
    private Account account;
    private Debit debit;
    private Savings savings;
    private String statement="";
    public Statement(Account account) {
        this.account = account;
    }
    public Statement(Debit debit) {
        this.debit = debit;//sa pot sa dau get la contul pt care s a facut statementul
        this.statement= this.statement + "-----------------STATEMENT-------------------\n"+ debit.bank + " BANK\n" + "Debit account of " +
                debit.owner_name + "\nStatement made on the date: " + LocalDate.now() + " " + LocalTime.now()+"\nCurrent balance = " + debit.balance
        +"\nPast transactions below:\n";
        for (String i : debit.transactions)
            this.statement= this.statement + i+"\n";
        this.statement= this.statement +"--------------END OF STATEMENT---------------";

    }
    public Statement(Savings savings) {
        this.savings = savings;
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
}
