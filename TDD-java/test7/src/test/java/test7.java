import org.junit.Test;

import static junit.framework.TestCase.*;

public class test7 {
    @Test
    public void testEquality() {
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(5).equals(new Dollar(6)));

        assertTrue(new Franc(5).equals(new Franc(5)));
        assertFalse(new Franc(5).equals(new Franc(6)));
        //又产生了两行重复代码，我们需要重构
        assertFalse(new Franc(5).equals(new Dollar(5)));
    }
}
