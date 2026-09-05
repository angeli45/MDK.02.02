package task3;

public class Practicum {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setMoneyAmount(1000);
        System.out.println("Количество денег на счету - " + bankAccount.getMoneyAmount() + " р.");
        bankAccount.takeMoney(500);
        System.out.println("Количество денег на счету - " + bankAccount.getMoneyAmount() + " р.");
    }
}

class BankAccount {

    private long moneyAmount=0;

    public long getMoneyAmount() {
        return moneyAmount;
    }

    public void setMoneyAmount(long newMoneyAmount) {
        this.moneyAmount += newMoneyAmount;
    }

    public void takeMoney(long withMoney){
        System.out.println("Со счёта снято " + moneyAmount + " р.");
        moneyAmount = 0;
    }
}