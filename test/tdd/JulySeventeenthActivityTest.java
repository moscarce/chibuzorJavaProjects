//package tdd;
//
//import julySeventeen.Multiply;
//import julySeventeen.Power;
//import julySeventeen.ReverseNumber;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class JulySeventeenthActivityTest {
//    @Test
//    public void testMultiplication(){
//        int test = Multiply.multiply(5 , 4);
//        assertEquals(20 , test);
//        int test1 = Multiply.multiply(-3 , 4);
//        assertEquals(-12 , test1);
//        int test2 = Multiply.multiply(6 , -3);
//        assertEquals(-18 , test2);
//    }
//    @Test
//    public void testPower(){
//        int power = Power.power(5,2);
//        assertEquals(25,power);
//        int power1 = Power.power(2,5);
//        assertEquals(32,power1);
//        int power2 = Power.power(4,3);
//        assertEquals(64,power2);
//    }
//    @Test
//    public void testReverseInteger(){
//        int number = 1682290;
//        assertEquals("0922861", ReverseNumber.reverse(number));
//        int number1 = 5674;
//        assertEquals("4765",ReverseNumber.reverse(number1));
//        int number2 = 9817;
//        assertEquals("7189",ReverseNumber.reverse(number2));
//    }
//}
