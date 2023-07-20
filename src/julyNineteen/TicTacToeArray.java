package julyNineteen;

public class TicTacToeArray {
    public static void main(String[] args) {
        char[][] list = {{'X','O','X'},{'O','O','X'},{'O','X','X'}};
        for (int index = 0; index < list.length; index++) {
            for (int innerIndex = 0; innerIndex < list[index].length; innerIndex++) {
                System.out.print(list[index][innerIndex] + " ");
            }
            System.out.println();
        }
    }
}