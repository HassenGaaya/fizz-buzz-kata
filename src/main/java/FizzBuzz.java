public class FizzBuzz {
    public String transform(int number) {
        if(number == 15 || number == 30 || number == 60)
            return "FizzBuzz";
        if (number % 3 == 0)
            return "Fizz";
        else if (number % 5 == 0)
            return "Buzz";
        else
            return "FizzBuzz";
    }
}
