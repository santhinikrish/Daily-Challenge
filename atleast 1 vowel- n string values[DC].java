/*input: 4
tiger
cat
deer
bird
output: yes
*/


import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s[]=new String[n];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        int count;
        for(int i=0;i<n;i++){
            char[] c=s[i].toCharArray();
            count=0;
            for(int j=0;j<c.length;j++){
                if(c[j]=='a'||c[j]=='e'||c[j]=='i'||c[j]=='o'||c[j]=='u'||c[j]=='A'||c[j]=='E'||c[j]=='I'||c[j]=='O'||c[j]=='U'){
                    count++;
                }
            }
            if(count==0){
                System.out.print("no");
                System.exit(1);
            }
        }
        System.out.print("yes");
	}
}
