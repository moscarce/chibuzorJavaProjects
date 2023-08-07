package arraySnacks.CheckOutApp;

import java.util.Scanner;

public class CheckOutApp {
    public static void main(String[] args) {
        CheckOutApp checkOutApp = new CheckOutApp();
        String name = checkOutApp.customersName();
        System.out.println(name);
        String product = checkOutApp.productName();
        System.out.println(product);
        double price = checkOutApp.pricePerUnit();
        System.out.println(price);
    }

    public Scanner collectInput(){
        return new Scanner(System.in);
    }
    public String customersName(){
        System.out.println("What is the customer's Name: ");
        String name = collectInput().nextLine();
        while (!(name.matches("^[a-zA-Z ]+$"))){
            System.out.println("Invalid Name");
            System.out.println("Name doesn't include numbers and special character");
            System.out.println("What is the customer's Name: ");
            name = collectInput().nextLine();
        }
        return name;
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
    public int totalProductPrice(){
        System.out.println("How many pieces");
        String pieces = collectInput().nextLine();
        while (!(pieces.matches("[0-9]+"))){
            System.out.println("Invalid price");
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


}
