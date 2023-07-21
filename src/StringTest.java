public class StringTest {
    public static void main(String[] args) {
        String name = "Test";
        String concatenatedName = "";
        System.out.println(concatenatedName.length());
        System.out.println();
        System.out.println(name.length());
        for (int i = 0; i < name.length(); i++) {
            concatenatedName += name.charAt(i);
        }
        System.out.println();
        System.out.println(concatenatedName.length());
        System.out.println();
        System.out.println(name.length());
    }
}
