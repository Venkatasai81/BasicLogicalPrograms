package BasicLogicProgrammes;

public class GreatestofThreeNumbers {

	public static void main(String[] args) {
    int num1=60 ;int num2 = 6 ; int num3 = 44;
    
    if ((num1>=num2)   && (num1>= num3))
    	System.out.println(num1+" is a greatest number");
    else if (num2>=num1   && num2>= num3)
    	System.out.println(num2+" is a greatest number");
    else 
    	System.out.println(num3+" is a greatest number");
	}

}

//int greatest = (num1>num2 && num1>num3) ? num1 :((num2>num3) ? num2 : num3);

