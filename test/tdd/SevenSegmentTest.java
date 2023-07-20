package tdd;

import julyNineteen.SevenSegment;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SevenSegmentTest {
    @Test
    public void testAllSwitches(){
        SevenSegment sevenSegment = new SevenSegment();
        sevenSegment.setSevenSegment("11111111");
        sevenSegment.getSevenSegment();

    }
    @Test
    public void testForInvalidNumber(){
        SevenSegment sevenSegment = new SevenSegment();
        sevenSegment.setSevenSegment("111111a1");
        sevenSegment.getSevenSegment();
        sevenSegment.setSevenSegment("19111181");
        sevenSegment.getSevenSegment();
        sevenSegment.setSevenSegment("1111111111");
        sevenSegment.getSevenSegment();
        sevenSegment.setSevenSegment("1111");


    }
    @Test
    public void testForNumberOne(){
        SevenSegment sevenSegment = new SevenSegment();
        sevenSegment.setSevenSegment("01100001");
        sevenSegment.getSevenSegment();
    }
    @Test
    public void testForNumberTwo(){
        SevenSegment sevenSegment = new SevenSegment();
        sevenSegment.setSevenSegment("11011011");
        sevenSegment.getSevenSegment();
    }
    @Test
    public void testForNumberThree(){
        SevenSegment sevenSegment = new SevenSegment();
        sevenSegment.setSevenSegment("11110011");
        sevenSegment.getSevenSegment();
    }
    @Test
    public void testForNumberFour(){
        SevenSegment sevenSegment = new SevenSegment();
        sevenSegment.setSevenSegment("00101111");
        sevenSegment.getSevenSegment();
    }
    @Test
    public void testForNumberFive(){
        SevenSegment sevenSegment = new SevenSegment();
        sevenSegment.setSevenSegment("10110111");
        sevenSegment.getSevenSegment();
    }
    @Test
    public void testForNumberSix(){
        SevenSegment sevenSegment = new SevenSegment();
        sevenSegment.setSevenSegment("10111111");
        sevenSegment.getSevenSegment();
    }
    @Test
    public void testForNumberSeven(){
        SevenSegment sevenSegment = new SevenSegment();
        sevenSegment.setSevenSegment("11100001");
        sevenSegment.getSevenSegment();
    }
    @Test
    public void testForNumberEight(){
        SevenSegment sevenSegment = new SevenSegment();
        sevenSegment.setSevenSegment("11111111");
        sevenSegment.getSevenSegment();
    }
    @Test
    public void testForNumberNine(){
        SevenSegment sevenSegment = new SevenSegment();
        sevenSegment.setSevenSegment("11110111");
        sevenSegment.getSevenSegment();
    }
    @Test
    public void testForZero(){
        SevenSegment sevenSegment = new SevenSegment();
        sevenSegment.setSevenSegment("11111101");
        sevenSegment.getSevenSegment();
    }
}
