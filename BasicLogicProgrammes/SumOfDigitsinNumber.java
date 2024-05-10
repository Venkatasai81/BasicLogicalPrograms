package BasicLogicProgrammes;

public class SumOfDigitsinNumber {

	public static void main(String[] args) {
      int number = 1232, sum = 0;
      
      while(number!=0) {
    	  sum += number%10;
    	  number = number/10;
      }
      System.out.println(sum);
	}
	
}

//By using recursion
//
//int num = 1232, sum =0;
//S.o.p(getSum(num,sum));
//}
//static int getSum(int num, int sum) {
//	if (num==0)
//		return sum;
//	
//	sum +=num%10;
//	return getSum(num/10,sum)
//}}
//}    or

//  getSum(num) return (num%10) +getSum(num/10);