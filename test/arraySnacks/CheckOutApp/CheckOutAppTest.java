package arraySnacks.CheckOutApp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckOutAppTest {
    @Test
    public void testCheckOutApp(){
        CheckOutApp checkOutApp = new CheckOutApp();
        checkOutApp.customersName();
        checkOutApp.updateList();
        checkOutApp.discount();
        checkOutApp.setSumTotal();
        checkOutApp.setVat();
        checkOutApp.setBillTotal();
        checkOutApp.printBill();
        checkOutApp.customerPayment();
        checkOutApp.printReceipt();
    }

}