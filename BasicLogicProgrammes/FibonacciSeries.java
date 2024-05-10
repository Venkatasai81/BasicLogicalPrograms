package BasicLogicProgrammes;

public class FibonacciSeries {

	public static void main(String[] args) {
      int num = 7, a= 0, b = 1,c;
	  System.out.println(a);
	  System.out.println(b);

      for (int i =2; i<=num; i++) {
    	  c=a+b;
    	  a=b;
    	  b=c;
    	  System.out.println(c);
      }
	}

}
