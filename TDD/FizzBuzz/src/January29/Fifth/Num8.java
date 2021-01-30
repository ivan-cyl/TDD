package January29.Fifth;

import static java.lang.String.valueOf;

public class Num8 {
    private int num;

    public Num8(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        if((isaBoolean(3) && isaBoolean(5))||(isContains("3") && isContains("5"))) return "FizzBuzz";
        if(isaBoolean(3) || isContains("3")) return "FizzBuzz";
        if(isaBoolean(5) || isContains("5")) return "FizzBuzz";
        return valueOf(num);
    }

    private boolean isaBoolean(int i) {
        return num % i == 0;
    }

    private boolean isContains(String s) {
        return valueOf(num).contains(s);
    }
}
