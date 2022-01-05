package hellocucumber;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;


class FizzBuzzTest {

    @Test
    void shouldGetOneForOne() {
        assertThat(FizzBuzz.of(1)).isEqualTo("1");
    }

    @Test
    void shouldGetTwoForTwo() {
        assertThat(FizzBuzz.of(2)).isEqualTo("2");
    }

    @Test
    void shouldGetFizzForThree() {
        assertThat(FizzBuzz.of(3)).isEqualTo("Fizz");
    }

    @Test
    void shouldGetFizzForSix() {
        assertThat(FizzBuzz.of(6)).isEqualTo("Fizz");
    }

    @Test
    void shouldGetBuzzForFive() {
        assertThat(FizzBuzz.of(5)).isEqualTo("Buzz");
    }

    @Test
    void shouldGetFizzBuzzForFifteen() {
        assertThat(FizzBuzz.of(15)).isEqualTo("FizzBuzz");
    }
}
