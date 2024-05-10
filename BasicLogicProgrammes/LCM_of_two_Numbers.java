package BasicLogicProgrammes;

public class LCM_of_two_Numbers {

	public static void main(String[] args) {
         int num1 = 12, num2 = 14,hcf = 1;
         
         
         for (int i = 1; i<=33; i++) {
        	 if (num1%i==0 && num2%i==0) 
        		 hcf = i;
        	 }
        	 
        	 int lcm =( num1*num2)/hcf;
        	 System.out.println("The LCM of two numbers is: "+ lcm);
         }
         
	}

