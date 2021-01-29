package January28.Fourth;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class OutTest3 {
    public static void main(String[] args) {
        Num3 num3=new Num3(1);
        assertThat(getActual(1),is("1"));
        assertThat(getActual(3),is("Fizz"));
        assertThat(getActual(5),is("Buzz"));
        assertThat(getActual(15),is("FizzBuzz"));
        assertThat(getActual(35),is("FizzBuzz"));
        assertThat(getActual(53),is("FizzBuzz"));
    }

    private static String getActual(int i) {
        return new Num3(i).toString();
    }
}
