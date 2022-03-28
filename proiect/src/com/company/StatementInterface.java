package com.company;

import java.util.HashSet;
import java.util.Set;

public interface StatementInterface {
    Set<StatementInterface> statements = new HashSet<>();
    public void getStatement();
    public void getTransactions();
}
