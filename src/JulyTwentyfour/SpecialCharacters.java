package JulyTwentyfour;

import java.util.Scanner;

public class SpecialCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter text to check if it contains ( $, #, _, -, :, ;, =)");
        String text = input.nextLine();
        System.out.println(checkSpecialCharacter(text));
        input.close();
    }
    private static boolean checkSpecialCharacter(String text){
        boolean containsCharacter = false;
        for (int index = 0; index < text.length(); index++) {
            if ((text.charAt(index) == '$') || (text.charAt(index) == '#') || (text.charAt(index) == '_') || (text.charAt(index) == '-') ||
                    (text.charAt(index) == ':') || (text.charAt(index) == ';') || (text.charAt(index) == '=')){
                containsCharacter = true;
                break;
            }
        }
        return containsCharacter;
    }
}
