/*input: 6
output: 9
*/


import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        String s=Integer.toBinaryString(n);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                count++;
            }
        }
        n=n+1;
        int i=n;
        for(;;i++){
            String a=Integer.toBinaryString(i);
            int c=0;
            for(int j=0;j<a.length();j++){
                if(a.charAt(j)=='1'){
                    c++;
                }
            }
            if(c==count){
                System.out.print(i);
                break;
            }
        }
	}
}


import java.util.*;
public class Hello
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=Integer.bitCount(n);
        for(int index=n+1;;index++)
        {
            int nextCount=Integer.bitCount(index);
            if(count==nextCount)
            {
                System.out.print(index);
                break;
            }
        }
	}
}