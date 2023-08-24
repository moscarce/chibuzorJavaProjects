package arraySnacks.CheckOutApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CheckOutApp {
    public static void main(String[] args) {
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
    private List<String> productNameList = new ArrayList<>();
    private List<Integer> quantity = new ArrayList<>();
    private List<Double> price = new ArrayList<>();
    private List<Double> total = new ArrayList<>();
    private double discount;
    private String customerName;
    private String cashierName;
    private double sumTotal;
    private double billTotal;
    private double vat;
    private double amountPaid;



    public Scanner collectInput(){
        return new Scanner(System.in);
    }
    public void customersName(){
        System.out.println("What is the customer's Name: ");
        String name = collectInput().nextLine();
        while (!(name.matches("^[a-zA-Z ]+$"))){
            System.out.println("Invalid Name");
            System.out.println("Name doesn't include numbers and special character");
            System.out.println("What is the customer's Name: ");
            name = collectInput().nextLine();
        }
        this.customerName = name;
    }
    public String productName(){
        System.out.println("What did the user buy?: ");
        String product = collectInput().nextLine();
        while (!(product.matches("^[a-zA-Z0-9 ]+$"))){
            System.out.println("Invalid product name");
            System.out.println("What did the user buy?: ");
            product = collectInput().nextLine();
        }
        return product;
    }
    public int quantity(){
        System.out.println("How many pieces");
        String pieces = collectInput().nextLine();
        while (!(pieces.matches("[0-9]+"))){
            System.out.println("Invalid input");
            System.out.println("How many pieces: ");
            pieces = collectInput().nextLine();
        }
        return Integer.parseInt(String.valueOf(pieces));
    }
    public double pricePerUnit(){
        System.out.println("How much per unit?: ");
        String price = collectInput().nextLine();
        while (!(price.matches("[0-9.]+"))){
            System.out.println("Invalid price");
            System.out.println("How much per unit?: ");
            price = collectInput().nextLine();
        }
        return Double.parseDouble(String.valueOf(price));
    }
    public void cashiersName(){
        System.out.println("What is your Name: ");
        String name = collectInput().nextLine();
        while (!(name.matches("^[a-zA-Z ]+$"))){
            System.out.println("Invalid Name");
            System.out.println("Name doesn't include numbers and special character");
            System.out.println("What is your Name: ");
            name = collectInput().nextLine();
        }
        this.cashierName = name;
    }
    public void discount(){
        System.out.println("How much discount will he/she get: ");
        String discount = collectInput().nextLine();
        while (!(discount.matches("^(?:100|[1-9]?[0-9])$"))){
            System.out.println("Invalid discount");
            System.out.println("How discount will he/she get: ");
            discount = collectInput().nextLine();
        }
        this.discount = (Double.parseDouble(String.valueOf(discount))/100);
    }
    public void setVat(){
        vat = sumTotal * 0.175;
    }
    public void setBillTotal(){
        billTotal = sumTotal + vat - (this.discount * sumTotal);
        this.discount *= sumTotal;
    }
    public double total(double price,int quantity){
        return price*quantity;
    }
    public void setSumTotal(){
        double total = 0;
        for (double prices : this.total){
            total += prices;
        }
        sumTotal = total;
    }

    public void updateList(){
        String product = productName();
        productNameList.add(product);
        int pieces = quantity();
        quantity.add(pieces);
        double unitPrice = pricePerUnit();
        price.add(unitPrice);
        double total = total(unitPrice,pieces);
        this.total.add(total);
        addItems();
    }
    public void addItems(){
        System.out.println("Add more items");
        String moreItems = collectInput().nextLine();
        if (moreItems.equalsIgnoreCase("yes"))updateList();
        else if (moreItems.equalsIgnoreCase("no")) cashiersName();
        else{
            System.out.println("Answer can only be either yes or no");
            addItems();
        }
    }
    public void printBill(){
        String sumTotal = String.format("%.2f", this.sumTotal);
        String discount = String.format("%.2f", this.discount);
        String vat = String.format("%.2f" , this.vat);
        String billTotal = String.format("%.2f" , this.billTotal);
        System.out.printf("""
SEMICOLON STORES
MAIN BRANCH
LOCATION: 312 HERBERT MACAULAY WAY, SABO YABA, LAGOS.
TEL: 83293828343
DATE: 9-AUG-2023 2:45:11 PM
Cashier: %s
Customer Name: %s
==============================================================================
                                      %s    %s    %s        %s
------------------------------------------------------------------------------
""",cashierName,customerName,"ITEM","QTY","PRICE","TOTAL(NGN)");
        for (int index = 0; index < productNameList.size(); index++) {
            System.out.printf(
                    "                               %10s   %2d      %.2f         %.2f"
            ,productNameList.get(index),quantity.get(index),price.get(index),total.get(index));
            System.out.println();
        }
        System.out.printf("""
------------------------------------------------------------------------------
                                        Sub Total:          %s
                                         Discount:          %s
                                     VAT @ 17.50:           %s
==============================================================================
                                       Bill Total:          %s
==============================================================================
            THIS IS NOT A RECEIPT KINDLY PAY %S
==============================================================================
""",sumTotal,discount,vat,billTotal,billTotal);

   }
   public void customerPayment(){
       System.out.println("How much did the customer give to you");
       String amount = collectInput().nextLine();
       while (!(amount.matches("[0-9.]+"))){
           System.out.println("Invalid price");
           System.out.println("Kindly put a valid price");
           System.out.println("How much did the customer give to you");
           amount = collectInput().nextLine();
       }
       if (Double.parseDouble(String.valueOf(amount)) < this.billTotal){
           System.out.println("Amount paid is less than the bill total");
           System.out.println("kindly pay " + this.billTotal);
           customerPayment();
       }
       else this.amountPaid = Double.parseDouble(amount);
   }
   public void printReceipt(){
       String sumTotal = String.format("%.2f", this.sumTotal);
       String discount = String.format("%.2f", this.discount);
       String vat = String.format("%.2f" , this.vat);
       String billTotal = String.format("%.2f" , this.billTotal);
       System.out.printf("""
SEMICOLON STORES
MAIN BRANCH
LOCATION: 312 HERBERT MACAULAY WAY, SABO YABA, LAGOS.
TEL: 83293828343
DATE: 9-AUG-2023 2:45:11 PM
Cashier: %s
Customer Name: %s
==============================================================================
                                      %s    %s    %s        %s
------------------------------------------------------------------------------
""",cashierName,customerName,"ITEM","QTY","PRICE","TOTAL(NGN)");
       for (int index = 0; index < productNameList.size(); index++) {
           System.out.printf(
                   "                               %10s   %2d      %.2f         %.2f"
                   ,productNameList.get(index),quantity.get(index),price.get(index),total.get(index));
           System.out.println();
       }
       System.out.printf("""
------------------------------------------------------------------------------
                                        Sub Total:          %s
                                         Discount:          %s
                                    VAT @ 17.50%%:           %s
==============================================================================
                                       Bill Total:          %s
                                      Amount Paid:          %.2f
                                          Balance:          %.2f
==============================================================================
                        THANK YOU FOR YOUR PATRONAGE
==============================================================================
""",sumTotal,discount,vat,billTotal,this.amountPaid,(this.amountPaid-this.billTotal));
   }




}
