/*input: 2417 2
output: YES
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        int d=sc.nextInt();
        long sum=0L;
        while(n>0){
            sum=n%10+(n/10)%10;
            if(sum%d!=0){
                System.out.print("NO");
                System.exit(1);
            }
            sum=0L;
            n/=100;
        }
        System.out.print("YES");
	}
}

	(or)

import java.util.*;
public class Hello{

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char[] c=s.toCharArray();
        int d=sc.nextInt();
        int l=s.length(),k=0;
        int a[]=new int[l];
        int sum=0;
        for(int i=0;i<l;i+=2){
            for(int j=i;j<i+2;j++){
                sum+=Integer.parseInt(String.valueOf(c[j]));
            }
            a[k++]=sum;
        }
        for(int i=0;i<k;i++){
            if(a[i]%d!=0){
                System.out.print("NO");
                System.exit(1);
            }
        }
        System.out.print("YES");
	}
}