package BasicLogicProgrammes;

public class LeapYear {

	public static void main(String[] args) {
       int year = 2024;
       if (year%400 == 0) {
    	   System.out.println(year + " Is a Leap Year");
       }
       else if(year%4 == 0  && year%100 != 0){
        	   System.out.println(year + " Is a Leap Year");

    	   }
//       (year%400 == 0) || (year%4 == 0  && year%100 != 0)    As Well by using This Ternary Operator also Works.
      
       else 
    	   System.out.println(year + " Not a Leap Year");

       
	}

}
