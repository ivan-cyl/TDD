import org.junit.Test;

import static junit.framework.TestCase.*;

public class test8 {
    @Test
    public void testEquality() {
//        assertTrue(new Dollar(5).equals(new Dollar(5)));
//        assertFalse(new Dollar(5).equals(new Dollar(6)));
//
//        assertTrue(new Franc(5).equals(new Franc(5)));
//        assertFalse(new Franc(5).equals(new Franc(6)));
//        //又产生了两行重复代码，我们需要重构
//        assertFalse(new Franc(5).equals(new Dollar(5)));

        assertTrue(Money.dollar(5).equals(Money.dollar(5)));
        assertFalse(Money.dollar(5).equals(Money.dollar(6)));

        assertTrue(Money.franc(5).equals(Money.franc(5)));
        assertFalse(Money.franc(5).equals(Money.franc(6)));
        //又产生了两行重复代码，我们需要重构
        assertFalse(Money.franc(5).equals(Money.dollar(5)));
    }

    @Test
    public void testMultiplication() {
////        Dollar five = Money.dollar(5);
//        Money five=Money.dollar(5);
//        assertEquals(new Dollar(10),five.times(2));
//        assertEquals(new Dollar(15),five.times(3));
//        //times()函数不是Mon类中定义的方法
        Money five=Money.dollar(5);
        assertEquals(Money.dollar(10),five.times(2));
        assertEquals(Money.dollar(15),five.times(3));
        //通过消除测试程序与子类存在的耦合，我们可以自由地改变继承关系而不会对模型代码造成影响

    }
}
