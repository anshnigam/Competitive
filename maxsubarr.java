/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void maximumSubArray(int[] arrA,int[] arrB){
        // sum of array b
        long sumB = 0;
        for(int b: arrB){
            if( b > 0){
                sumB += b;
            }
        }
        
        long sumA1 = 0;
		long mA1 = 0;
		for(int e : arrA){
		    sumA1 += e;
		    if( mA1 < sumA1 ){
		        mA1 = sumA1;
		    }
		    if( sumA1 < 0 ) sumA1 = 0;
		}
		
		long sumA2 = 0;
		long mA2 = 0;
		for(int i = arrA.length - 1 ; i >= 0 ; i--){
		    sumA2 += arrA[i];
		    if( mA2 < sumA2 ){
		        mA2 = sumA2;
		    }
		    if( sumA2 < 0 ) sumA2 = 0;
		}
		
		System.out.println( Math.max( mA2 + sumB , mA1 + sumB ) );
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int testcases = sc.nextInt();
		for(int i = 0; i < testcases; i++){
		    //getting array A
		    int sizeA = sc.nextInt();
		    int[] arrA = new int[sizeA];
		    for(int j = 0;j < sizeA;j++){
		        arrA[j] = sc.nextInt();
		    }
		    //getting array B
		    int sizeB = sc.nextInt();
		    int[] arrB = new int[sizeB];
		    for(int j = 0;j< sizeB;j++){
		        arrB[j] = sc.nextInt();
		    }
		    //computing results
		    maximumSubArray(arrA,arrB);
		}
	}
}
