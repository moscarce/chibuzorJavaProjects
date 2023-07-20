//package julySeventeenth;
//
public class Multiply {
    public static void main(String[] args) {
        System.out.println(multiply(5,5));
        System.out.println(multiply(-4,-9));
    }
    public static int multiply(int firstNumber, int secondNumber){
        int total = 0;
        if (secondNumber > 0){
            for (int i = 0; i < secondNumber; i++) {
                total+= firstNumber;
            }
        } else if (firstNumber < 0 && secondNumber < 0) {
            firstNumber = -firstNumber;
            for (int i = 0; i > secondNumber; secondNumber++) {
                total += firstNumber;
            }
        } else{
            for (int i = 0; i < firstNumber; i++) {
                total+= secondNumber;
            }
        }
        return total;
    }
}
//public class MultiplicationWithoutOperator {
//    public static int multiply(int a, int b) {
//        boolean isNegative = false;
//
//        // Check if one of the numbers is negative
//        if ((a < 0 && b > 0) || (a > 0 && b < 0)) {
//            isNegative = true;
//        }
//
//        // Convert both numbers to positive
//        a = Math.abs(a);
//        b = Math.abs(b);
//
//        int result = 0;
//
//        // Add 'a' to the result 'b' times
//        for (int i = 0; i < b; i++) {
//            result += a;
//        }
//
//        // Change the sign of the result if necessary
//        if (isNegative) {
//            result = -result;
//        }
//
//        return result;
//    }
//
//    public static void main(String[] args) {
//        int num1 = 5;
//        int num2 = 6;
//        int product = multiply(num1, num2);
//        System.out.println("Product: " + product);
//    }
//}
