/*
Example Input/Output 1:
Input: 4
12 24 42 22
Output:
0 64
12 0
24 22
54 0
Explanation:
The first integer is 12.
There are no integers on the left side of 12, so 0 is printed.
The sum of integers ending with the unit digit of 12 on the right side of 12 is 64 (42 + 22).
The second integer is 24.
The sum of integers ending with the first digit of 24 on the left side of 24 is 12.
There are no integers ending with the unit of 24 on the right side of 24, so 0 is printed.
The third integer is 42.
The sum of integers ending with the first digit of 42 on the left side of 42 is 24.
The sum of integers ending with the unit digit of 42 on the right side of 42 is 22.
The fourth integer is 22.
The sum of integers ending with the first digit of 22 on the left side of 22 is 54 (12 + 42).
There are no integers on the right side of 22, so 0 is printed.

Example Input/Output 2:
Input: 6
646 666 673 633 643 711
Output:
0 666
646 0
1312 1276
1312 643
1312 0
0 0
*/

import java.util.*;
public class Hello {
    public static long fir(long n){
        while(n>=10){
            n/=10;
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long a[]=new long[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextLong();
        }
        for(int i=0;i<n;i++){
            long sum=0,r=a[i]%10;
            for(int j=i+1;j<n;j++){
                if(a[j]%10==r){
                    sum+=a[j];
                }
            }
            long sum1=0,r1=fir(a[i]);
            for(int j=i-1;j>=0;j--){
                if(a[j]%10==r1){
                    sum1+=a[j];
                }
            }
            System.out.println(sum1+" "+sum);
        }
	}
}
