/*
Example Input/Output 1:
Input:
2 2 0 3 3 8
Output:
4 6 8 0 0 0
Explanation:
The integers in the given list are 2 2 0 3 3 8.
The 1st and 2nd integers are equal.
After replacing the 1st integer with the next multiple of 2 and the 2nd integer with 0, the list becomes 4 0 0 3 3 8.
The 4th and 5th integers are equal.
After replacing the 4th integer with the next multiple of 3 and the 5th integer with 0, the list becomes 4 0 0 6 0 8.
There are no more integers in the list to replace.
After shifting all the zeroes to the end, the list becomes 4 6 8 0 0 0.
Hence the output is 4 6 8 0 0 0

Example Input/Output 2:
Input:
10 10 10
Output:
20 10 0
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s[]=sc.nextLine().split(" ");
        int a[]=new int[s.length],k=0;
        for(int i=0;i<s.length;i++){
            a[i]=Integer.parseInt(s[i]);
        }
        for(int i=0;i<s.length;i++){
            if(i!=s.length-1 && a[i]==a[i+1] && a[i]!=0){
                a[i]=a[i]*2;
                a[i+1]=0;
            }
        }
        for(int i=0;i<s.length;i++) {
            if(a[i]!=0)
            System.out.print(a[i]+" ");
        }
        for(int i=0;i<s.length;i++){
            if(a[i]==0)
            System.out.print(a[i]+" ");
        }
	  }
}
