import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class test4 {
    @Test
    public void testMultiplication(){
        Dollar five = new Dollar(5);
//        Dollar product=five.times(2);
////        assertEquals(10,product.amount);
//        assertEquals(new Dollar(10),product);
//        product=five.times(5);
////        assertEquals(15,product.amount);
//        assertEquals(new Dollar(15),product);

        assertEquals(new Dollar(10),five.times(2));
        assertEquals(new Dollar(15),five.times(3));

    }
}
