public class EchoFourAndEight {
        public static void main(String[] args) {
            for (int number = 1; number < 11; number++) {
                if (number % 4 == 0) {
                    for(int echo = 1; echo < 6; echo++) {
                        System.out.print(number + " ");
                    }
                }
            }
        }
}
