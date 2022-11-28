import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class FizzBuzzTest {

    @ParameterizedTest
    @ValueSource(ints = {3, 6, 9, 12})
    void returnFizzForThree(int number) {
        Assertions.assertThat(new FizzBuzz().transform(number))
                .isEqualTo("Fizz");
    }

    @Test
    void returnBuzzForFive() {
        Assertions.assertThat(new FizzBuzz().transform(5))
                .isEqualTo("Buzz");
    }

    @Test
    void returnBuzzForTen() {
        Assertions.assertThat(new FizzBuzz().transform(10))
                .isEqualTo("Buzz");
    }

    @Test
    void returnBuzzForTwenty() {
        Assertions.assertThat(new FizzBuzz().transform(20))
                .isEqualTo("Buzz");
    }
}
