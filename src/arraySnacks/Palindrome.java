package arraySnacks;

public class Palindrome {
    public static void main(String[] args) {
        String test = "madam";
    }
    public static void palindrome(String[] word){
        String[] list1 = new String[word.length];
        int reverseIndex = 0;
        for (int index = (word.length - 1); index >= 0;index--){
            list1[reverseIndex] = word[index];
            reverseIndex += 1;
        }
        if(word == list1){
            System.out.println("It's a palindrome");
        }
        else {
            System.out.println("It's not a palindrome");
        }
    }
}
