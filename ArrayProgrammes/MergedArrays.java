package ArrayProgrammes;
import java.io.*;
import java.util.Arrays;
public class MergedArrays {

	public static void main(String[] args) {
        
		int a[] = { 1,2,3,4 };
		
		int b[] = { 12,23,31,24 };
		
		int a1 = a.length;
		
		int b1 = b.length;
		
		int c1 = a1 + b1;
		
		int[] c = new int[c1];
		
//		System.arraycopy(a, 0, c, 0, a1);
//		System.arraycopy(b, 0, c, a1, b1);
//		Sop.p(Arrays.toString(c));

		
		for (int i =0 ; i <a1 ; i++) {
			
			c[i] = a[i];
		}
         
        for (int i =0 ; i <b1 ;  i++) {
			
			c[a1 + i] = b[i];
		}
         
        for (int i =0 ; i <c1 ;  i++) {
			
		
        System.out.println(c[i]);
        
        }
		
	}
}

