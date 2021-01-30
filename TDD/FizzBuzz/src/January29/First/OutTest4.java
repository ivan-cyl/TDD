package January29.First;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class OutTest4 {
    public static void main(String[] args) {
        assertThat(getActual(1),is("1"));
        assertThat(getActual(3),is("Fizz"));
        assertThat(getActual(5),is("Buzz"));
        assertThat(getActual(15),is("FizzBuzz"));
        assertThat(getActual(35),is("FizzBuzz"));
        assertThat(getActual(53),is("FizzBuzz"));

    }

    private static String getActual(int i) {
        return new Num4(i).toString();
    }
}
