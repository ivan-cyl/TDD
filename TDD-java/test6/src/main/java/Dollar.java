public class Dollar extends Money{
//    private int amount;

    Dollar(int amount){
        this.amount=amount;
    }
    Dollar times(int multiplier){
        return new Dollar(amount*multiplier);
    }

//    public boolean equals(Object object){
////        Dollar dollar=(Dollar) object;
////        Money dollar=(Dollar) object;
////        Money dollar=(Money) object;
//        Money money=(Money) object;
//
////        return amount==dollar.amount;
//        return amount==money.amount;
//    }
}
