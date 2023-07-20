public class MultiplesOfFourAndEidght {
    public static void main(String[] args) {
        int powerFour = 1;
        int powereight = 1;
        for (int number = 1; number < 6; number++) {
            if (number % 4 == 0) {
                for (int echo = 1; echo < 6; echo++) {
                    powerFour = powerFour * number;
                    System.out.print(powerFour + " ");
                }
            }
        }
            for (int num = 6; num < 9; num++) {
                if (num % 8 == 0) {
                    for (int ech = 1; ech < 6; ech++) {
                        powereight = powereight * num;
                        System.out.print(powereight + " ");
                    }
                }
            }
    }
}
