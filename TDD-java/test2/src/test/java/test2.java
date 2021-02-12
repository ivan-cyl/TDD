import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class test2 {
    @Test
    public void testMutiplication(){
        Dollar five=new Dollar(5);
        Dollar product=five.times(2);
        assertEquals(10,product.amount);
        product=five.times(3);
        assertEquals(15,product.amount);
    }
}
