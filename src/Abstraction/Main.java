package Abstraction;

public class Main {
    static void main() {
        SavingAccount acc = new SavingAccount();
        BankAccount.bankName = "Salaam Somali Bank";
        System.out.println(acc.bankName);
        System.out.println(acc.balance);
        acc.withdraw(200);
        System.out.println("---------------");

        CurrentAccount acc2 = new CurrentAccount();
        System.out.println(acc2.bankName);
        acc2.withdraw(250);
    }
}
