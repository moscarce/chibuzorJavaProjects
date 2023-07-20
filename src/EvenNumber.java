import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
//        for (int number = 1; number < 11; number++) {
//            if (number % 2 == 0) System.out.print(number + " ");
//        }
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = input.nextInt();
        boolean divisibleByBoth = number % 5 == 0 && number % 6 ==0;
        boolean divisibleByEither = number % 5 == 0 || number % 6 ==0;
        boolean divisibleByEitherNotBoth = number % 5 == 0 ^ number % 6 ==0;
        System.out.println("Is " + number + "divisible by 5 and 6? " + divisibleByBoth);
        System.out.println("Is " + number + "divisible by 5 or 6? " + divisibleByEither);
        System.out.println("Is " + number + "divisible by 5 or 6, but not both? " + divisibleByEitherNotBoth);
    }
}