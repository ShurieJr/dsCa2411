package Abstraction;

public abstract class BankAccount {
    protected double balance;
    static String bankName = "MyBank";

    public BankAccount(){
        balance = 300;
    }

    public void deposit(double amount){  //concrete method
        if(amount > 0 )
            balance += amount;
        else
            System.out.println("amount mus be greater than zero!");
    }
    public abstract void withdraw(double amount);  //abstract method
}
