/*
input: 5 3
1 2 1 3 1
output:
2 3 1

input: 12 5
7 8 10 8 7 6 6 4 2 1 1 10
output:
6 4 2 1 10
*/ 


import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		}
		int b[]=new int[n];
		int l=0;
		for(int i=n-1;i>=0;i--){
		    b[l++]=a[i];
		}
		for(int i=0;i<l;i++){
		    for(int j=i+1;j<l;j++){
		        if(b[i]==b[j]){
		            b[j]=-1;
		        }
		    }
		}
		int c[]=new int[l];
		int m=0;
		for(int i=l-1;i>=0;i--){
		    if(b[i]!=-1)
		    c[m++]=b[i];
		}
		int z=m;
		int x=0;
		while(k>0){
		    z--;
		    k--;
		}
		for(int i=z;i<m;i++){
		    System.out.print(c[i]+" ");
		}
	}
}

	(or)


#include<stdio.h>
#include <stdlib.h>

int main()
{
    int n,m,k=0,z=0;
    scanf("%d\n%d",&n,&m);
    int a[n],b[n];
    for(int i=0;i<n;i++)
    {
        scanf("%d ",&a[i]);
    }
    for(int i=n-1;i>0;i--)
    {
        for(int j=i-1;j>=0;j--)
        {
            if(a[i]==a[j]&&a[j]!=-1&&a[i]!=-1)
            {
                a[j]=-1;
            }
        }
    }
    for(int i=n-1;i>=0;i--)
    {
        if(a[i]!=-1&&k<m)
        {
            b[z++]=a[i];
            k++;
        }

    }
    for(int i=z-1;i>=0;i--)
    {
        printf("%d ",b[i]);
    }
}