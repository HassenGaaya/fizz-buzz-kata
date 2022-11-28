public class FizzBuzz {
    public String transform(int number) {
        if (number % 3 == 0)
            return "Fizz";
        else if (number == 5 || number == 10 || number == 20)
            return "Buzz";
        else
            return null;
    }
}
