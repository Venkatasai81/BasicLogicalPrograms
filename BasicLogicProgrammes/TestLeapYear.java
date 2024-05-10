package BasicLogicProgrammes;

public class TestLeapYear {

	public static void main(String[] args) {
		int year = 2054;
		boolean leap= (year% 4 ==0) && ((year % 100 !=0) || (year % 400 == 0)) ;
		System. out. println(year + (leap ? " is a leap year" : " is not a leap year")) ;
//		String leap= ((year% 4 ==0) && ((year % 100 !=0) || (year % 400 == 0))) ?  "is a leap year" :  "is not a leap year";
//		System. out. println(year + leap);
	}

}
