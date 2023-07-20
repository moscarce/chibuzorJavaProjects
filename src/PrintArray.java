public class PrintArray {
    public static void main(String[] args) {
//        int[] numbers = new int[5];
//        numbers[0] = 2;
//        numbers[1] = 4;
//        numbers[2] = 6;
//        numbers[3] = 8;
//        numbers[4] = 10;
//        for(int index = 0; index < 5; index++) {
//            System.out.println(numbers[index] );
//        }
        int n = 17;
        for(int i=2; i <= n/2; i++) {
            System.out.println("Looping " +i);
            if(n % i == 0) {
                System.out.println(i);
                continue;
            }
            System.out.println("prime");
        }
    }
}
