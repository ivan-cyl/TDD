package January28.First;



import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class OutTest {
    public static void main(String[] args) {
        Num n=new Num(1);
        assertThat(new Num(1).toString(),is("1"));
        assertThat(new Num(3).toString(),is("1"));
        assertThat(new Num(5).toString(),is("1"));
        assertThat(new Num(15).toString(),is("1"));
        assertThat(new Num(35).toString(),is("1"));
        assertThat(new Num(53).toString(),is("1"));

    }
}
