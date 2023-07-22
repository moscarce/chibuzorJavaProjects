public class EnforcingPrivacyWithCryptography {
    public static void main(String[] args) {
        System.out.println(encryptData("1234"));
        System.out.println(decryptData("0189"));
        System.out.println(encryptData("0002"));
        System.out.println(decryptData("7977"));

    }
    public static String encryptData(String number) {
        int digit;
        int[] encryptedDigit = new int[4];
        String encryptedNumber = "";
        for (int index = 0; index < number.length(); index++) {
            digit = Integer.parseInt(String.valueOf(number.charAt(index)));
            digit += 7;
            digit %= 10;
            encryptedDigit[index] = digit;
        }
        encryptedNumber += encryptedDigit[2];
        encryptedNumber += encryptedDigit[3];
        encryptedNumber += encryptedDigit[0];
        encryptedNumber += encryptedDigit[1];
        return encryptedNumber;
    }
    public static String decryptData(String number) {
        int digit;
        int[] decryptedDigit = new int[4];
        String decryptedNumber = "";
        for (int index = 0; index < number.length(); index++) {
            digit = Integer.parseInt(String.valueOf(number.charAt(index)));
            if(digit > 6)digit -= 7;
            else digit += 3;
            decryptedDigit[index] = digit;
        }
        decryptedNumber += decryptedDigit[2];
        decryptedNumber += decryptedDigit[3];
        decryptedNumber += decryptedDigit[0];
        decryptedNumber += decryptedDigit[1];
        return decryptedNumber;
    }
}
