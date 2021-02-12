public class Dollar {
//    int amount;
    private int amount;
    Dollar(int amount){
        this.amount=amount;
    }
    Dollar times(int multiplier){
        return new Dollar(amount*multiplier);
    }

    //    public boolean equals(Object object){
//        return true;
//    }
    public boolean equals(Object object){
        Dollar dollar=(Dollar) object;
        return amount==dollar.amount;
    }
}
