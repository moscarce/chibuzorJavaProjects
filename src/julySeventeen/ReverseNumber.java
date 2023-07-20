package julySeventeen;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(reverse(123450));
    }
    public static String reverse(int number){
        String str = "" + number;
        String reverse = "";
        for (int i = (str.length()-1);i >= 0 ; i--) {
             reverse += str.charAt(i);
        }
        return reverse;
    }
}
