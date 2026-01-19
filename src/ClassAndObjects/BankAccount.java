package ClassAndObjects;

public class BankAccount {
    long accountNumber;
    double balance;

    double deposit(double depositAmount){
        balance = balance + depositAmount;
        return balance;
    }
}

class BnkACT{
    public static void main(String[] args) {
        BankAccount bankACT = new BankAccount();
        bankACT.accountNumber = 1254687451;

        System.out.println("Account number is: "+bankACT.accountNumber);
        System.out.println("Final amount after deposit is: "+bankACT.deposit(1000.25));
    }
}