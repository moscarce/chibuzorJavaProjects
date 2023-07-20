package julyNineteen;

public class TicTacToeEdit {
    public static void main(String[] args) {
        char[][] list = {
                        {'X','O','X'},
                        {'O','O','X'},
                        {'0','X','X'}
                            };
        for (int index = 0; index < list.length; index++) {
            for (int innerIndex = 0; innerIndex < list[index].length; innerIndex++) {
                if (list[index][innerIndex] == 'X'){
                    list[index][innerIndex] = '1';
                }
                else {
                    list[index][innerIndex] = '0';
                }
                System.out.print(list[index][innerIndex] + " ");
            }
            System.out.println();
        }
    }
}
