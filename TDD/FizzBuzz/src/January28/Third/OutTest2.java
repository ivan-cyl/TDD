package January28.Third;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class OutTest2 {
    public static void main(String[] args) {
        assertThat(new Num2(1).toString(),is("1"));
        assertThat(new Num2(3).toString(),is("Fizz"));
        assertThat(new Num2(5).toString(),is("Buzz"));
        assertThat(new Num2(15).toString(),is("FizzBuzz"));
        assertThat(new Num2(35).toString(),is("FizzBuzz"));
        assertThat(new Num2(53).toString(),is("FizzBuzz"));
    }
}
