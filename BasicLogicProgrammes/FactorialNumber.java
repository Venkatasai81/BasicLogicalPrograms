package BasicLogicProgrammes;

public class FactorialNumber {
	public static void main(String[] args) {

	int number = 6;
	int factNum = factorial(number);
	System.out.println("The factorial of " +number + " is "+ factNum +".");
	}
       public  static int factorial(int n) {
        	 if (n==0) {
        		 return 1;
        	 }
        	 else {
        	 
        	 return n*factorial(n-1);
         }
         
	}

}
