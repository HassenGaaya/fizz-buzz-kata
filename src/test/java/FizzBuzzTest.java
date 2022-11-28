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
}
