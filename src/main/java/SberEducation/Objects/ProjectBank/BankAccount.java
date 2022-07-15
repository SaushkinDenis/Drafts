package SberEducation.Objects.ProjectBank;

import java.util.ArrayList;
import java.util.Date;


class BankAccount {
    private int id;
    private double balance;
    private double annualInterestRate = 4.5;
    private Date dateCreated;
    private String ownerAccount;
    private ArrayList<Transaction> transaction = new ArrayList<>();

    BankAccount() {
       this(0, "None", 0);
    }

    BankAccount(int id, String ownerAccount, double balance){
        this.id = id;
        this.ownerAccount = ownerAccount;
        this.balance = balance;
        this.dateCreated = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterest(){
        return this.annualInterestRate / 12 * this.balance / 100;
    }

    public String getOwnerAccount() {
        return ownerAccount;
    }

    public ArrayList<Transaction> getTransaction() {
        return transaction;
    }

    public void withdraw(double cash){
        this.balance -= cash;
        this.transaction.add(new Transaction('-', cash, this.balance, "Снятие средств со счета"));

    }

    public void deposit(double cash){
        this.balance += cash;
        transaction.add(new Transaction('+', cash, this.balance, "Пополнение счета"));
    }
}
