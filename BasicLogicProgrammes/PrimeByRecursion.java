package BasicLogicProgrammes;

public class PrimeByRecursion {

	public static void main(String[] args) {

		int i =2;
		boolean isPrime = true;
		
		int n = 77;
		isPrime = checkPrime(n,i);
		
		String result = isPrime ? " Prime": " not Prime"; 
		System.out.print(n+result);
	}

	static boolean checkPrime(int n ,int i) {
		if(n<2)
			return false;
		if (i==n)
			return true;
		if (n%i==0)
			return false;
		i=i+1;
		
		return checkPrime(n,i);

	}
}
