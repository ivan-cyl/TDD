import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class test5 {
    @Test
    public void testFrancMultiplication(){
        Franc five=new Franc(5);
        assertEquals(new Franc(10),five.times(2));
        assertEquals(new Franc(15),five.times(3));
    }
}
