package BasicLogicProgrammes;

public class PallindrommeStringBuilder {

	public static void main(String[] args) {
		
       System.out.println(isPallindromme("radar".toLowerCase()));
       System.out.println(isPallindromme("civic".toLowerCase()));
       System.out.println(isPallindromme("4544".toLowerCase())); 
	}

	// By using boolean check whether true or false
	public static Boolean isPallindromme(String stringName)
	{
		
		//By Using  String Builder creating a String
		
	String reversed = new StringBuilder(stringName).reverse().toString();
	// stringName is Orginal String reversed is the ordered String
	    return  stringName.equals(reversed);

}
}