/*input: 5 3
2 30 10 12 20
1 5
2 3
3 5
output:
2
10
2
*/


import java.util.*;
public class Hello {
    public static int hcf(int a,int b){
        if(b==0){
            return a;
        }
        return hcf(b,a%b);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int b;
        int c;
        for(int i=0;i<t;i++){
            b=sc.nextInt();
            c=sc.nextInt();
            int fin=a[b-1];
            for(int k=b;k<c;k++){
                fin=hcf(fin,a[k]);
            }
            System.out.println(fin);
        }
	}
}