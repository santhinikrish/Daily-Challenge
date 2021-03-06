/*input: google lego
output: yes
expla: in s1 - g,o,l,e nd in s2 - l,e,g,o*/  


import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        char ch1[]=s1.toCharArray();
        char ch2[]=s2.toCharArray();
        Set<Character> x=new HashSet<Character>();
        Set<Character> y=new HashSet<Character>();
        for(char a:ch1){
            x.add(a);
        }
        for(char a:ch2){
            y.add(a);
        }
        List<Character> c1=new ArrayList<Character>(x);
        List<Character> c2=new ArrayList<Character>(y);
        Collections.sort(c1);
        Collections.sort(c2);
        int l1=c1.size(),l2=c2.size();
        if(l1!=l2){
            System.out.print("no");
        }else{
            for(int i=0,j=0;i<l1 && j<l2;i++,j++){
                if(c1.get(i)!=c2.get(j)){
                    System.out.print("no");
                    System.exit(1);
                }
            }
            System.out.print("yes");
        }
	}
}