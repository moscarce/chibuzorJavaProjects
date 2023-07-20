public class EchoFourAndEightMultiples {
        public static void main(String[] args) {
            int num = 1;
            for (int number = 1; number < 11; number++) {
                if (number % 4 == 0) {
                    for(int echo = 1; echo < 6; echo++) {
                        num = num*number;
                        System.out.print(num + " ");
                    }
                    num= 1;
                }
            }
        }
}
