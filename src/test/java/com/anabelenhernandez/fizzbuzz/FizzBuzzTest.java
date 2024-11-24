package com.anabelenhernandez.fizzbuzz;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    @Test
    public void testFizz() {
        assertThat(FizzBuzz.fizzBuzz(3), is("Fizz"));
        assertThat(FizzBuzz.fizzBuzz(13), is("Fizz"));
        assertThat(FizzBuzz.fizzBuzz(9), is("Fizz"));
    }

    @Test
    public void testBuzz() {
        assertThat(FizzBuzz.fizzBuzz(5), is("Buzz"));
        assertThat(FizzBuzz.fizzBuzz(25), is("Buzz"));
        assertThat(FizzBuzz.fizzBuzz(10), is("Buzz"));
    }

    @Test
    public void testFizzBuzz() {
        assertThat(FizzBuzz.fizzBuzz(15), is("FizzBuzz"));
        assertThat(FizzBuzz.fizzBuzz(30), is("FizzBuzz"));
    }

    @Test
    public void testNumber() {
        assertThat(FizzBuzz.fizzBuzz(1), is("1"));
        assertThat(FizzBuzz.fizzBuzz(2), is("2"));
        assertThat(FizzBuzz.fizzBuzz(4), is("4"));
    }
}
