public class Money {
    //protected有利于子类仍然可以看到
    protected int amount;

    public boolean equals(Object object){
        Money money=(Money) object;
        return amount==money.amount;
    }
//    Franc.equals()与Money.equals()函数几乎是一致的
//    通过修改现在Franc.equals()与Money.equals()已经没有区别了，我们可以去除实现了
}
