public class Franc extends Money {
    //为了使用父类的amount域
//    private int amount;

    Franc(int amount) {
        this.amount = amount;
    }

    Franc times(int multiplier) {
        return new Franc(amount * multiplier);
    }

    //    public boolean equals(Object object) {
//        Franc franc = (Franc) object;
//        return amount == franc.amount;
//    }

//    public boolean equals(Object object) {
//        Money money = (Money) object;
//        return amount == money.amount;
//    }
}

