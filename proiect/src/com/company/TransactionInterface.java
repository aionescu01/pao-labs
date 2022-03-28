package com.company;

import java.util.List;
import java.util.Vector;

public interface TransactionInterface {
    List<String> transactions = new Vector();

    public void AddFunds(double sum, String Bank);
    public void WithdrawFunds(double sum, String Bank);
}
