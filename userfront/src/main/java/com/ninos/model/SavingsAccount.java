package com.ninos.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class SavingsAccount {
    private Long id;
    private int accountNumber;
    private BigDecimal accountBalance;

    private List<SavingTransaction> savingTransactionList;




}
