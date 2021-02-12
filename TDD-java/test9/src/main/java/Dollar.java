import java.rmi.MarshalledObject;
import java.util.concurrent.atomic.DoubleAccumulator;

public class Dollar extends Money{
//    Dollar(int amount){
//        this.amount=amount;
//    }
//    Money times(int multiplier){
//        return new Dollar(amount*multiplier);
//    }

    private String currency;
//    Dollar (int amount){
//        this.amount=amount;
//        currency="USD";
//    }
    String currency(){
        return currency;
    }

//    Dollar(int amount, String currency){
//        this.amount=amount;
//        this.currency=currency;
//    }
    Money times(int multiplier){
        return Money.dollar(amount*multiplier);
    }
    Dollar(int amount,String currency){
        super(amount,currency);
    }
}
