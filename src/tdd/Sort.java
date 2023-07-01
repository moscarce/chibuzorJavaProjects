package tdd;

import static java.lang.String.*;

public class Sort {
    private String sort;

    public void sort(int firstNumber, int secondNumber, int thirdNumber) {
        String first = String.valueOf(firstNumber);
        String second = String.valueOf(secondNumber);
        String third = String.valueOf(thirdNumber);
        if (firstNumber <= secondNumber && firstNumber <= thirdNumber) {
            if (secondNumber <= thirdNumber) {
                sort = first +","+ second +","+ third;
            } else if (thirdNumber <= secondNumber) {
                sort = first +","+ third +","+ second;
            }
        }
        if (secondNumber <= firstNumber && secondNumber <= thirdNumber) {
            if (firstNumber <= thirdNumber) {
                sort = second +","+ first +","+ third;
            } else if (thirdNumber <= firstNumber) {
                sort = second +","+ third +","+ first;
            }
        }
        if (thirdNumber <= secondNumber && thirdNumber <= firstNumber) {
            if (secondNumber <= firstNumber) {
                sort = third +","+ second +","+ first;
            } else if (firstNumber <= secondNumber) {
                sort = third +","+ first +","+ second;
            }
        }
    }
    public String getSort(){
        return sort;
    }
}