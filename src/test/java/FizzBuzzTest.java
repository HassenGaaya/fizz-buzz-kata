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

    @ParameterizedTest
    @ValueSource(ints = {15, 30, 45, 60, 90})
    void returnFizzBuzzForMultipleOfBothThreeAndFive() {
        Assertions.assertThat(new FizzBuzz().transform(15))
                .isEqualTo("FizzBuzz");
    }
}
