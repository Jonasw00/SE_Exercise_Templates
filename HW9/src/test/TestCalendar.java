package test;



import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.GregorianCalendar;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import main.Calendar;

class TestCalendar {
	
	
	

	@ParameterizedTest
	@ValueSource(ints = {2000, 2004, 2008, 2024, 2012})
	public void Should_return_true(int year) {
		Calendar cal = new Calendar(year);
		//GregorianCalendar gCal = new GregorianCalendar();
	
		//boolean expectedResult = gCal.isLeapYear(year);
		boolean actualResult = cal.isLeapYear();
		
		//assertEquals(expectedResult, actualResult);
		assertTrue(actualResult);
		
	}

	@ParameterizedTest
	@ValueSource(ints = {1825, 1910, 1955, 2002, 2021})
	public void Should_return_false(int year) {
		Calendar cal = new Calendar(year);
		//GregorianCalendar gCal = new GregorianCalendar();
	
		//boolean expectedResult = gCal.isLeapYear(year);
		boolean actualResult = cal.isLeapYear();
		
		//assertEquals(expectedResult, actualResult);
		assertFalse(actualResult);
	}

	@ParameterizedTest
	@ValueSource(ints = {1999, 2000, 2004, 2008, 2018})
	public void Should_return_if_year_is_leap(int year) {
		Calendar cal = new Calendar(year);
		GregorianCalendar gCal = new GregorianCalendar();
	
		boolean expectedResult = gCal.isLeapYear(year);
		boolean actualResult = cal.isLeapYear();
		
		assertEquals(expectedResult, actualResult);
	}

	// Create a new method for boundary testing
	@ParameterizedTest
	@ValueSource(ints = {1, 9999, 1834, 1612, 3002})
	public void Should_return_if_year_is_leap_at_boundarys(int year) {
		Calendar cal = new Calendar(year);
		GregorianCalendar gCal = new GregorianCalendar();
	
		boolean expectedResult = gCal.isLeapYear(year);
		boolean actualResult = cal.isLeapYear();
		
		assertEquals(expectedResult, actualResult);
	}
}
