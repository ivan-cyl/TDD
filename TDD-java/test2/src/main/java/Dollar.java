public class Dollar {
    int amount;
    Dollar(int amount){
        this.amount=amount;
    }
    //    Dollar times(int multiplier){
//        amount*=multiplier;
//        return null;
//    }
    Dollar times(int multiplier){
        return new Dollar(amount*multiplier);
    }
}
