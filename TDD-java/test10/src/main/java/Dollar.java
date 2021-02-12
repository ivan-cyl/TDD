import java.rmi.MarshalledObject;
import java.util.concurrent.atomic.DoubleAccumulator;

public class Dollar extends Money{

    private String currency;

    String currency(){
        return currency;
    }

//    Money times(int multiplier){
//        return Money.dollar(amount*multiplier);
//    }

    Dollar(int amount,String currency){
        super(amount,currency);
    }

//    Money times(int multiplier){
//        return new Dollar(amount*multiplier,"USD");
//    }

//    Money times(int multiplier){
//        return new Dollar(amount*multiplier,currency);
//    }

    Money times(int multiplier){
        return new Money(amount * multiplier, currency);
    }


}
