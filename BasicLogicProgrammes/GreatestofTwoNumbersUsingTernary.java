package BasicLogicProgrammes;

public class GreatestofTwoNumbersUsingTernary {

	public static void main(String[] args) {
          int num1 = 22; int num2 = 32; int temp;
          if (num1==num2)
        	  System.out.println("The Two Numbers are Equal\n");
          
          else
          {
        	 temp = (num1>num2) ? num1:num2; 
        	 
        	 // for three numbers again --> result = temp>num3 ? temp: num;
        	 
    	  System.out.println(temp + " is a Largest Number");
          }
	}

}


// Math.max(num1,num2)