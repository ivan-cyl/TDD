package January28.Second;

import January28.First.Num;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class OutTest1 {
    public static void main(String[] args) {
        Num1 n=new Num1(1);
        assertThat(new Num1(1).toString(),is("1"));
        assertThat(new Num1(3).toString(),is("Fizz"));
        assertThat(new Num1(5).toString(),is("Buzz"));
        assertThat(new Num1(15).toString(),is("FizzBuzz"));
        assertThat(new Num1(35).toString(),is("FizzBuzz"));
        assertThat(new Num1(53).toString(),is("FizzBuzz"));

    }
}
