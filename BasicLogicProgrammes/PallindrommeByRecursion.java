package BasicLogicProgrammes;

public class PallindrommeByRecursion {

	public static void main(String[] args) {
     int Num = 545, reverse = 0 , remainder;
     
     if ((getRecurse(Num,reverse) == Num))
    	 System.out.print(Num +" Is a Pallindromme");
     else 
    	 System.out.print(Num +" Is a Not Pallindromme");

	}
	static int getRecurse(int Num , int reverse) {
		if (Num==0)
			return reverse;
		int remainder = Num%10;
		reverse = reverse*10 + remainder;
		return getRecurse(Num/10,reverse);
	}

}
