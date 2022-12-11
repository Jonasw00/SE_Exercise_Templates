package main;

public class FizzBuzz {
	
	public String convertNumber(int number) {
		
		if (number % 5 == 0 && number % 7 != 0) {
		      return "Fizz";
		    }

		if (number % 7 == 0 && number % 5 != 0) {
		      return "Buzz";
		    }
	    
		if (number % 5 == 0 && number % 7 == 0) {
	      return "FizzBuzz";
	    }
		return "";
	}
}
