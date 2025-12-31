package com.eazybytes.loans.service;

import com.eazybytes.loans.dto.LoanRequestDto;
import com.eazybytes.loans.dto.LoansDto;

public interface ILoansService {
    void createLoans(LoanRequestDto loanRequestDto);
    LoansDto fetchLoan(String mobileNumber);
    boolean deleteLoan(String mobileNumber);
}
