package BasicLogicProgrammes;
import java.util.Scanner;
public class HarshadNumber {

	public static void main(String[] args) {
   // A number is exactly divisible by own its sum of it digits.
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Give an integer Number");

	 int num = sc.nextInt();
	 int OrgNum = num;
	 int sum =0;
	 while(num!=0) {
		 int digits =num%10;
		 sum = sum +digits;
		 num /= 10;
	 }
		
	 if(OrgNum%sum==0) 
		 System.out.println(OrgNum+" is a harshad Number");
		 else
			 System.out.println(OrgNum+" is not a harshad Number");

	 }
	
}
