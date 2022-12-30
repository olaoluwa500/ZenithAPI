package com.etz.org.ZenithApi;

public class Request {
    private Float amount;
    private String beneficiaryName;
    private String crAccount;
    private String paymentReference;
    private String drAccount;
    private String transactionReference;
    private String senderName;

    public Request() {

    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public void setBeneficiaryName(String beneficiaryName) {
        this.beneficiaryName = beneficiaryName;
    }

    public void setCrAccount(String crAccount) {
        this.crAccount = crAccount;
    }

    public void setPaymentReference(String paymentReference) {
        this.paymentReference = paymentReference;
    }

    public void setDrAccount(String drAccount) {
        this.drAccount = drAccount;
    }

    public void setTransactionReference(String transactionReference) {
        this.transactionReference = transactionReference;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public Float getAmount() {
        return amount;
    }

    public String getBeneficiaryName() {
        return beneficiaryName;
    }

    public String getCrAccount() {
        return crAccount;
    }

    public String getPaymentReference() {
        return paymentReference;
    }

    public String getDrAccount() {
        return drAccount;
    }

    public String getTransactionReference() {
        return transactionReference;
    }

    public String getSenderName() {
        return senderName;
    }

}
