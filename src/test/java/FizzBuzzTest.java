import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    @Test
    void returnFizzForThree() {
        Assertions.assertThat(new FizzBuzz().transform(3))
                .isEqualTo("Fizz");
    }

    @Test
    void returnFizzForSix() {
        Assertions.assertThat(new FizzBuzz().transform(6))
                .isEqualTo("Fizz");
    }

    @Test
    void returnFizzForNine() {
        Assertions.assertThat(new FizzBuzz().transform(9))
                .isEqualTo("Fizz");
    }


}
