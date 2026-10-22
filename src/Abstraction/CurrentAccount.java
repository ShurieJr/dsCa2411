package Abstraction;

public class CurrentAccount extends BankAccount{
    @Override
    public void withdraw(double amount) {
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("withdrawn: " + amount +
                    " from current account");
            System.out.println("Balance : " + balance);
        }
        else{
            System.out.println("haraagaagu kuma filna!");
        }
    }
}
