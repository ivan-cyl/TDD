public class Money {
    protected int amount;

    public boolean equals(Object object){
        Money money=(Money) object;
        //getClass()方法返回运行时类的一个对象
        // 该Class对象是被表示的类的静态同步方法锁定的对象
        return amount==money.amount&&getClass().equals(money.getClass());
        //以保证数值和类均相等
    }
}
