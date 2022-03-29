import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzShould {
    @Test
    public void make_fizz_buzz_should_be_a_number () {
        String expected = "1";
        int param = 1;
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals(expected, fizzBuzz.makeFizzBuzz(param));

    }

    @Test
    public void make_fizz_buzz_should_be_fizz (){
        String expected = "Fizz";
        int param = 3;
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals(expected, fizzBuzz.makeFizzBuzz(param));
    }

    @Test
    public void make_fizz_buzz_should_be_buzz(){
        String expected = "Buzz";
        int param = 5;
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals(expected, fizzBuzz.makeFizzBuzz(param));
    }

    @Test
    public void make_fizz_buzz_should_be_fizzbuzz(){
        String expected = "FizzBuzz";
        int param = 15;
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals(expected, fizzBuzz.makeFizzBuzz(param));
    }

    @Test
    public void fizz_buzz_list_should_be_first_one() {
        List<String> expected = List.of("1");
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals(expected.get(0), fizzBuzz.fizzBuzzList().get(0));
    }

    @Test
    public void fizz_buzz_list_position_3_should_be_fizz(){
        List<String> expected = new ArrayList<>(List.of("1","2","Fizz"));
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals(expected.get(2), fizzBuzz.fizzBuzzList().get(2));
    }
}
