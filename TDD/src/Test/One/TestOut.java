package Test.One;

import Main.One.OutTest;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TestOut {
    public static void main(String[] args) {
        assertThat(getActual(1),is("1"));
        assertThat(getActual(3),is("Fizz"));
        assertThat(getActual(5),is("Buzz"));
        assertThat(getActual(13),is("Fizz"));
        //假设除法比包含优先级高，因此输出Fizz，如果改变优先级，调换if语句即可
        assertThat(getActual(51),is("Fizz"));
        //assertThat(getActual(52),is("Buzz"));
        assertThat(getActual(52),is("Buzz"));
        assertThat(getActual(35),is("FizzBuzz"));
        assertThat(getActual(15),is("FizzBuzz"));
        assertThat(getActual(53),is("FizzBuzz"));
    }

    private static String getActual(int i) {
        return new OutTest(i).toString();
    }
}
