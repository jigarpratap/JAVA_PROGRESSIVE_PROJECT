package com.wecp.progressive.entity;


public class Accounts implements Comparable<Accounts> {
    
     private int account_id;
    private int customer_id;
    private double balance;
    
    public Accounts(int account_id, int customer_id, double balance) {
        this.account_id = account_id;
        this.customer_id = customer_id;
        this.balance = balance;
    }
    

    public Accounts() {
    }


    public int getAccount_id() {
        return account_id;
    }
    public void setAccount_id(int account_id) {
        this.account_id = account_id;
    }
    public int getCustomer_id() {
        return customer_id;
    }
    public void setCustomer_id(int d) {
        this.customer_id = d;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }


    @Override
    public int compareTo(Accounts o) {
          return this.account_id-o.account_id;
    }


    @Override
    public String toString() {
        return "Accounts [account_id=" + account_id + ", customer_id=" + customer_id + ", balance=" + balance + "]";
    }




}