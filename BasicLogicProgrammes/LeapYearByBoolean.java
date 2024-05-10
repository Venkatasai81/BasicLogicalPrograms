package BasicLogicProgrammes;

public class LeapYearByBoolean {

	public static void main(String[] args) {
        int year = 2028;
        boolean flag;
        
        if (year % 400 ==0) {
        	flag = true;
        }
        else if (year %4 ==0 && year %100  !=0) {
        	flag = true;

        }
        else 
        	flag = false;
	

	if (flag) 
		System.out.println(year + " is a leap year");
	
     else 
	System.out.println(year + " not a leap year");

}
}
