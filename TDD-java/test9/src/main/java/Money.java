abstract class Money {
    protected int amount;

    public boolean equals(Object object){
        Money money=(Money) object;
        //getClass()方法返回运行时类的一个对象
        // 该Class对象是被表示的类的静态同步方法锁定的对象
        return amount==money.amount&&getClass().equals(money.getClass());
        //以保证数值和类均相等
    }
    //将Money类改成抽象类
    abstract Money times(int multiplier);

//    static Money dollar(int amount){
//        return new Dollar(amount);
//    }
    //这样任何客户代码都不知道是否存在一个Dollar的子类
//    static Money franc(int amount){
//        return new Franc(amount);
//    }

//    abstract String currency();
    protected String currency;
    String currency(){
        return currency;
    }

    static Money franc(int amount){
//        return new Franc(amount,null);
        return new Franc(amount,"CHF");
    }
    static Money dollar(int amount){
        return new Dollar(amount,"USD");
    }

    Money(int amount,String currency){
        this.amount=amount;
        this.currency=currency;
    }
}
