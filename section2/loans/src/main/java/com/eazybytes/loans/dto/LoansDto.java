package com.eazybytes.loans.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;

@Data
public class LoansDto {
    @NotNull(message = "Mobile Number can not be null or empty.")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile Number must be 10 digits.")
    private String mobileNumber;
    @NotNull(message = "Loan Number can not be null or empty.")
    @Pattern(regexp = "(^$|[0-9]{12})", message = "Loan Number must be 12 digits.")
    private String loanNumber;
    @NotNull(message = "Loan Type can not be null or empty.")
    private String loanType;
    @Positive(message = "Total Loan Amount should be greater than zero.")
    private int totalLoan;
    @PositiveOrZero(message = "Total Amount Paid should be greater than or equals to zero.")
    private int amountPaid;
    @PositiveOrZero(message = "Total Outstanding Amount should be greater than or equals to zero.")
    private int outstandingAmount;

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getLoanNumber() {
        return loanNumber;
    }

    public void setLoanNumber(String loanNumber) {
        this.loanNumber = loanNumber;
    }

    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    public int getTotalLoan() {
        return totalLoan;
    }

    public void setTotalLoan(int totalLoan) {
        this.totalLoan = totalLoan;
    }

    public int getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(int amountPaid) {
        this.amountPaid = amountPaid;
    }

    public int getOutstandingAmount() {
        return outstandingAmount;
    }

    public void setOutstandingAmount(int outstandingAmount) {
        this.outstandingAmount = outstandingAmount;
    }
}
