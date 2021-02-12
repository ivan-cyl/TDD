import java.io.File;

public class Franc extends Money {
    private String currency;

    String currency() {
        return currency;
    }

//    Money times(int multiplier){
//        return Money.franc(amount*multiplier);
//    }

    Franc(int amount, String currency) {
        super(amount, currency);
    }

//    Money times(int multiplier){
//        return new Franc(amount*multiplier,"CHF");
//    }

//    Money times(int multiplier){
//        return new Franc(amount*multiplier,currency);
//    }

//    Money times(int multiplier) {
//        return new Money(amount * multiplier, currency);
//    }

    Money times(int multiplier){
//        return new Franc(amount*multiplier,currency);
        return new Money(amount*multiplier,currency);
    }
}

