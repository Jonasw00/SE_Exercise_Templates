package test;

import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.rules.ExpectedException;

import main.Calculator;


class TestCalculator {

	Calculator calculator = new Calculator();

	@Test
	public void Should_add_two_numbers_and_return_result() {
		int expectedResult = 2+3;
		int actualResult = calculator.add(2, 3);
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void Should_substract_two_numbers_and_return_result() {
		int expectedResult = 5-3;
		int actualResult = calculator.sub(5, 3);
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void Should_multiply_two_numbers_and_return_result() {
		int expectedResult = 2*3;
		int actualResult = calculator.multiply(2, 3);
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void Should_divide_two_numbers_and_return_result() {
		int expectedResult = 10/2;
		float actualResult = calculator.divide(10, 2);
		
		assertEquals(expectedResult, actualResult);
	}
	
	
	  @Rule
	  public ExpectedException thrown;

	  @Test
	  public void shouldThrowAnArithmeticExceptionIfDenominatorIsZero() {
		  Exception exception = assertThrows(ArithmeticException.class, () -> {
		        float actualResult = calculator.divide(4, 0);
		    });
		    String expectedMessage = "ZeroDivisionError";
		    String actualMessage = exception.getMessage();

		    assertTrue(actualMessage.contains(expectedMessage));
		}
	  }

