package BasicLogicProgrammes;

public class BitwiseEvenOdd {

	  public static void main(String[] args) {
	        int number = 8;

	        if (isEven(number))
	            System.out.println( number +" is Even");
	        else
	            System.out.println(number +  "  is  Odd");
	    }

	    // Returns true if n is even, else odd
	    static boolean isEven(int number) {
	        // n & 1 is 1, then odd, else even
	        return (number & 1) == 0;
	    }
	}