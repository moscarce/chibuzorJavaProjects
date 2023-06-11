package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {
    @Test
        public void canDepositIntoAccountTest(){
            Account tobiAccount = new Account("8775");
            int currentAccount = tobiAccount.getBalance("8775");
            assertEquals(0, currentAccount);
            tobiAccount.deposit(5000);
            currentAccount = tobiAccount.getBalance("8775");
            assertEquals(5000, currentAccount);
    }

    @Test
        public void canDepositTwice(){
        Account tobiAccount = new Account("1234");
        tobiAccount.deposit(4500);
        int currentBalance = tobiAccount.getBalance("1234");
        assertEquals(4500, currentBalance);
        tobiAccount.deposit(2500);
        currentBalance = tobiAccount.getBalance("1234");
        assertEquals(7000, currentBalance);
    }
    @Test
        public void cannotDepositNegativeInteger(){
        Account tobiAccount = new Account("4321");
        tobiAccount.deposit(1000);
        int currentBalance = tobiAccount.getBalance("4321");
        assertEquals(1000, currentBalance);
        tobiAccount.deposit(-2000);
        currentBalance = tobiAccount.getBalance("4321");
        assertEquals(1000, currentBalance);
    }
    @Test
        public void canWithdraw(){
        Account tobiAccount = new Account("5412");
        tobiAccount.deposit(5000);
        int currentBalance = tobiAccount.getBalance("5412");
        assertEquals(5000, currentBalance);
        tobiAccount.withdraw(3000, "5412");
        currentBalance = tobiAccount.getBalance("5412");
        assertEquals(2000, currentBalance);
    }
    @Test
        public void userPinForWithdrawalAndBalance(){
        Account tobiAccount = new Account("1234");
        tobiAccount.deposit(5000);
        int currentBalance = tobiAccount.getBalance("1234");
        assertEquals(5000, currentBalance);
        tobiAccount.withdraw(3000, "1234");
        currentBalance = tobiAccount.getBalance("1234");
        assertEquals(2000, currentBalance);
    }
    @Test
        public  void withdrawMoreThanBalance(){
        Account tobiAccount = new Account("1234");
        tobiAccount.deposit(5000);
        int currentBalance = tobiAccount.getBalance("1234");
        assertEquals(5000, currentBalance);
        tobiAccount.withdraw(8000, "1234");
        currentBalance = tobiAccount.getBalance("1234");
        assertEquals(5000, currentBalance);

    }
}
