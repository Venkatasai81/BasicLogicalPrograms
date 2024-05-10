package BasicLogicProgrammes;

public class SumRangeUsingRecursion {

	public static void main(String[] args) {
          int Num1 = 13;
          int Num2 = 5;
          int sum = getSum(0,Num1,Num2);
          System.out.println(sum);
	}
          static int getSum(int sum, int a,int  b) {
        	  if (a>b) 
        		  return sum;
        	  return a + getSum(sum, a+1, b);
          }
          
	}


