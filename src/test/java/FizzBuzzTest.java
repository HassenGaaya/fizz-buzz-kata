import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class FizzBuzzTest {

    @ParameterizedTest
    @ValueSource(ints = {3, 6, 9, 12})
    void returnFizzForMultipleOfThree(int number) {
        Assertions.assertThat(new FizzBuzz().transform(number))
                .isEqualTo("Fizz");
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 10, 20, 25})
    void returnBuzzForMultipleOfFive() {
        Assertions.assertThat(new FizzBuzz().transform(5))
                .isEqualTo("Buzz");
    }

    @Test
    void returnFizzBuzzForFifteen() {
        Assertions.assertThat(new FizzBuzz().transform(15))
                .isEqualTo("FizzBuzz");
    }

    @Test
    void returnFizzBuzzForThirty() {
        Assertions.assertThat(new FizzBuzz().transform(30))
                .isEqualTo("FizzBuzz");
    }

    @Test
    void returnFizzBuzzForSixty() {
        Assertions.assertThat(new FizzBuzz().transform(60))
                .isEqualTo("FizzBuzz");
    }
}
