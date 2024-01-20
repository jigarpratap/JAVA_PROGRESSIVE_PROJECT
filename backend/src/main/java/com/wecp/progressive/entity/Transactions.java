package com.wecp.progressive.entity;
import java.util.Date;


public class Transactions {
    private int transaction;
    private int account_id;
    private double amount;
    private Date transaction_date;
    private String transaction_type;
   
    
   public Transactions() {
    }
public Transactions(int transaction, int account_id, double amount, Date transaction_date, String transaction_type) {
       this.transaction = transaction;
       this.account_id = account_id;
       this.amount = amount;
       this.transaction_date = transaction_date;
       this.transaction_type = transaction_type;
   }
   public int getTransaction() {
       return transaction;
   }
   public void setTransaction(int transaction) {
       this.transaction = transaction;
   }
   public int getAccount_id() {
       return account_id;
   }
   public void setAccount_id(int account_id) {
       this.account_id = account_id;
   }
   public double getAmount() {
       return amount;
   }
   public void setAmount(double amount) {
       this.amount = amount;
   }
   public Date getTransaction_date() {
       return transaction_date;
   }
   public void setTransaction_date(Date transaction_date) {
       this.transaction_date = transaction_date;
   }
   public String getTransaction_type() {
       return transaction_type;
   }
   public void setTransaction_type(String transaction_type) {
       this.transaction_type = transaction_type;
   }

}