//public class EnforcingPrivacyWithCryptography {
//    public static void main(String[] args) {
//        encryptInteger(1234);
//    }
//    public static void encryptInteger(int number){
//        if (number > 999 && number < 10000){
//            int[] encryptedNumbers = new int[4];
//            String encryptedOutput = "";
//            int digit;
//            for (int i = 0; i < 4; i++) {
//                digit = number % 10;
//                number /= 10;
//                digit += 7;
//                digit %= 10;
//                encryptedNumbers[i] = digit;
//            }
//            encryptedOutput = encryptedOutput + encryptedNumbers[1] + encryptedNumbers[0] + encryptedNumbers[3] + encryptedNumbers[2];
//            System.out.println("Encrypted number: " + encryptedOutput);
//        }else {
//            System.out.println("Number must be four digits integer");
//        }
//    }
//    public static void decryptInteger(int number){
//        if (number > 999 && number < 10000){
//            int[] decryptedNumber = new int[4];
//            String decryptedOutput = "";
//            int digit;
//            for (int i = 0; i < 4; i++) {
//                digit = number % 10;
//                if (digit >= 0 && digit < 7){
//                    digit += 3;
//                    decryptedNumber[i]=digit;
//                }else {
//                    decryptedNumber[i]=digit;
//                }
//
//            }
//            decryptedOutput = decryptedOutput + decryptedNumber[3] + decryptedNumber[2] + decryptedNumber[]
//        }else {
//            System.out.println("Number must be four digits integer");
//        }
//    }
//}
