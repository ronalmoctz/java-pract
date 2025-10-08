package POO;

public class BankAccount {
    double depositAmount;

    public BankAccount(Double depositAmount){
        this.depositAmount = depositAmount;
    }

    public void newBalance(){
        double balance = 4500.0;
        double totalBlance = balance + depositAmount;
        System.out.println("New balance: " + totalBlance);
    }
}
