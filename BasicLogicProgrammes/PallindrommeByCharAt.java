package BasicLogicProgrammes;

public class PallindrommeByCharAt {
	
 public static void main(String[] args) {
			
	       System.out.println(isPallindromme("radar".toLowerCase()));
	       System.out.println(isPallindromme("civic".toLowerCase()));
	       System.out.println(isPallindromme("4544".toLowerCase())); 
		}
		// By using boolean check whether true or false
		public static Boolean isPallindromme(String Orginal)
		{
			String Reversed = "";
			int len = Orginal.length();
			
			for (int i = len -1; i>= 0 ; i--) {
				Reversed = Reversed + Orginal.charAt(i);
			}
			
			return Orginal.equals(Reversed);
	}
	}