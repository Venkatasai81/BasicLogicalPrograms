package BasicLogicProgrammes;

public class SumofNumbersGIvenRange {

	public static void main(String[] args) {
        int num1 = 6;
        int num2 = 18;
        int sum = 0;
        for(int i = num1; i <= num2;i++) 
        	sum += i;
        	System.out.println("Sum of the range of between the two numbers is:"+ sum);
        	
        
	}

}

// Formula Method = num2(num2+1)/2   - num1(num1+1)/2  + num1