import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class FizzBuzzTest {

    private final FizzBuzz fizzBuzz = new FizzBuzz();

    @ParameterizedTest
    @ValueSource(ints = {3, 6, 9, 12})
    void returnFizzForMultipleOfThree(int number) {
        Assertions.assertThat(fizzBuzz.transform(number))
                .isEqualTo("Fizz");
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 10, 20, 25})
    void returnBuzzForMultipleOfFive(int number) {
        Assertions.assertThat(fizzBuzz.transform(number))
                .isEqualTo("Buzz");
    }

    @ParameterizedTest
    @ValueSource(ints = {15, 30, 45, 60, 90})
    void returnFizzBuzzForMultipleOfBothThreeAndFive(int number) {
        Assertions.assertThat(fizzBuzz.transform(number))
                .isEqualTo("FizzBuzz");
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 4, 14, 17, 23, 53})
    void returnNullForNumbersNotMultipleOfNeitherThreeNorFive(int number) {
        Assertions.assertThat(fizzBuzz.transform(number))
                .isEqualTo(Integer.toString(number));
    }
}
