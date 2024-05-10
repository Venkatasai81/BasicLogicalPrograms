package BasicLogicProgrammes;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// list of armstrong numbers : 1 2 3 4 5 6 7 8 9   153 370 371 407 1634
		
         int num = 153, temp,number, total = 0; 
         number = num;
         while (number != 0)
         {
         temp = number % 10;
         total = total + temp*temp*temp;
//         total = total + Math.pow(temp, num.length());   if num is string it is possible

         number /= 10;
         } 
         if(total == num) {
         System.out.println(num + " is an Armstrong number");
         }
         else {
         System.out.println(num + " is not an Armstrong number");
         }

}

}
