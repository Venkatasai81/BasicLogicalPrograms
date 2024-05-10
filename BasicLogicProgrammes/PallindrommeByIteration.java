package BasicLogicProgrammes;

public class PallindrommeByIteration {

	public static void main(String[] args) {
      int Number = 9999, remainder , reverse = 0;
      int temp = Number;
        
        while(temp!=0)
        {
        remainder = Number%10;
        reverse = reverse*10 + remainder;
        temp /=10;
	}
		if (Number==reverse) {
			System.out.println(Number+" is a Pallindromme Number");
		}
		else {
		
			
			System.out.println(Number+" Not is a Pallindromme Number");
		}

}
}