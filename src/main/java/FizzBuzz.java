import java.util.List;

public class FizzBuzz {
    public String makeFizzBuzz(int number) {
        String result = number+"";

        if (number % 3 == 0) {
            result = "Fizz";
        }
        if (number % 5 == 0){
            result = result.equals("Fizz") ? "FizzBuzz" : "Buzz";
        }

        return result;
    }
    public List<String> fizzBuzzList() {
        List<String> result = new java.util.ArrayList<>();
        for (int i = 0; i < 100; i++) {
            result.add(makeFizzBuzz(i+1));
        }
        return result;
    }
}
