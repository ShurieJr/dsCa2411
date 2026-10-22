package Abstraction;

public class SavingAccount extends BankAccount {

    @Override
    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance - amount >= 100) {
                balance -= amount;
                System.out.println("Withdrawn: " + amount + " from saving account");
                System.out.println("Balance : " + balance);
            }
            else{
                System.out.println("minimum saving account balance $100 required!");
            }
        } else {
            System.out.println("amount mus be greater than zero!");
        }
    }
}
