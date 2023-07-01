package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortTest {
    @Test
    public void testThatFirstNumberAsLowestNumberWillBeSortedFirst(){
        Sort number = new Sort();
        number.sort(11,20,30);
        assertEquals("11,20,30",number.getSort());
        number.sort(11,40,30);
        assertEquals("11,30,40",number.getSort());
    }
    @Test
    public void testThatSecondNumberAsLowestNumberWillBeSortedFirst(){
        Sort number = new Sort();
        number.sort(11,5,30);
        assertEquals("5,11,30",number.getSort());
        number.sort(39,4,30);
        assertEquals("4,30,39",number.getSort());
    }
    @Test
    public void testThatThirdNumberAsLowestNumberWillBeSortedFirst(){
        Sort number = new Sort();
        number.sort(11,5,3);
        assertEquals("3,5,11",number.getSort());
        number.sort(39,50,3);
        assertEquals("3,39,50",number.getSort());
    }
    @Test
    public void testThatNumbersAreEqual(){
        Sort number = new Sort();
        number.sort(-11,101,-300);
        assertEquals("-300,-11,101",number.getSort());
        number.sort(39,50,39);
        assertEquals("39,39,50",number.getSort());
        number.sort(11,5,5);
        assertEquals("5,5,11",number.getSort());
        number.sort(39,39,39);
        assertEquals("39,39,39",number.getSort());
    }
}
