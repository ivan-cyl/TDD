import java.io.File;

public class Franc extends Money {
//    Franc(int amount) {
//        this.amount = amount;
//    }

//    Money times(int multiplier) {
//        return new Franc(amount * multiplier);
//    }

    private String currency;
//    Franc (int amount){
//        this.amount=amount;
//        currency="CHF";
//    }
    String currency(){
        return currency;
    }

//    Franc(int amount,String currency){
//        this.amount=amount;
//        this.currency="CHF";
//    }

    Money times(int multiplier){
//        return new Franc(amount*multiplier,null);
        return Money.franc(amount*multiplier);
    }

    Franc(int amount,String currency){
        super(amount,currency);
    }
}

