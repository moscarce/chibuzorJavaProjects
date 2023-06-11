package tdd;

public class Account {
    private int balance;
    private String pin;

    public Account(String userPin) {
        if (userPin.matches("\\d+")) {
            if (userPin.length() != 4) return;
            this.pin = userPin;
        }
    }


    public int getBalance(String inputPin) {
        if (inputPin.equals(pin ) ) return balance;

        return 0;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public int withdraw(int amount, String userPin) {
        if (userPin.equals(pin ) && amount <= balance)return balance -= amount;

        return balance;
    }
}
