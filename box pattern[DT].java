/*input: 7
output:
& & & & & & &
& * * * * * &
& * . . . * &
& * . . . * &
& * . . . * &
& * * * * * &
& & & & & & &



import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1||j==1||i==n||j==n){
                    System.out.print("& ");
                }else if(i==2||j==2||i==n-1||j==n-1){
                    System.out.print("* ");
                }else{
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
	}
}
