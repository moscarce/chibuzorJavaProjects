package tdd;

public class ArrayMethod {
    private int result;

    public void add(int[] numbers){
        for (int number : numbers) {
            result += number;
        }
    }
    public int answer(){
        return result;
    }
}
