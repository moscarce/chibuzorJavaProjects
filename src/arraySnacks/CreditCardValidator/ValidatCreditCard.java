package arraySnacks.CreditCardValidator;

import java.util.Scanner;

public class ValidatCreditCard {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, Kindly enter card details to verify");
        String cardNumber = input.nextLine();
        if (cardNumber.matches("\\d+") && (cardNumber.length() > 12) && (cardNumber.length() < 17)){
            int[] numbers = new int[cardNumber.length()];
            String printCardNumber = "";
            int digit;
            int doubleNumberTotal = 0;
            int oddPositionTotal = 0;
            for (int index = 0; index < cardNumber.length(); index++) {
                numbers[index] = Integer.parseInt(String.valueOf(cardNumber.charAt(index)));
                if(index % 2 == 0){
                    digit = numbers[index] * 2;
                    if (digit > 9){
                        String castDoubleDigit = "";
                        castDoubleDigit += digit;
                        digit = Integer.parseInt(String.valueOf(castDoubleDigit.charAt(0))) + Integer.parseInt(String.valueOf(castDoubleDigit.charAt(1)));
                    }
                    doubleNumberTotal += digit;
                }else oddPositionTotal += numbers[index];
            }
            for (int number : numbers) {
                printCardNumber += number;
            }

            String cardType = "";
            int cardDigitLength = cardNumber.length();
            String printCardValidityStatus = "";
            int sumResult = doubleNumberTotal + oddPositionTotal;
            boolean isValid = sumResult % 10 == 0;

            if (isValid) printCardValidityStatus += "Valid";
            else printCardValidityStatus += "Invalid";
            if (numbers[0] == 4) cardType += "VisaCard";
            else if (numbers[0] == 5) cardType += "MasterCard";
            else if (numbers[0] == 3 && numbers[1] == 7) cardType += "AmericanExpressCard";
            else if (numbers[0] == 6) cardType += "DiscoverCard";
            else cardType += "Invalid card";
            System.out.printf("""
                    ****************************************************************************************
                    **Credit card type: %s
                    **Credit card type: %s
                    **Credit card Digit length: %d
                    **Credit card validity status: %s
                    ****************************************************************************************
                    """, cardType,printCardNumber,cardDigitLength,printCardValidityStatus);





        } else if (cardNumber.matches("\\d+")) {
            System.out.println("Invalid card details(Card number must have between 13 and 16 digits)");
        } else {
            System.out.println("Invalid card details(Card numbers must not have alphabets or symbols in it)");
        }


        input.close();
    }
}
