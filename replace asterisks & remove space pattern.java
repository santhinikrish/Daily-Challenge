/*input: welcome to home
output:
welcometohome
welcom*t*hom*
welco****ho**
welc*****h***
wel**********
we***********
w************
*/


import java.util.*;
public class Hello {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] s=str.split(" ");
        int m=0;
        for(int i=0;i<s.length;i++){
            int l=s[i].length();
            if(l>m){
                m=l;
            }
        }
        String a="";
        int k=0,c=0;
        for(int i=0;i<m;i++){
            c++;
            for(int j=0;j<s.length;j++){
                k=s[j].length();
                a=s[j];
                for(int h=0;h<a.length();h++){
                    if((k-c)+1>h){
                        System.out.print(a.charAt(h));
                    }else{
                        System.out.print('*');
                    }
                }
            }
            System.out.println();
        }
	}
}