import java.io.*;
import java.util.Scanner;

class countXInRange{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n,no,u,l,count=0;
		n=sc.nextInt();
		for(int i=0;i<n;i++){
			no=sc.nextInt();
			u=sc.nextInt();
			l=sc.nextInt();
			for(int j=u;j<l;j++){
					if((j+1)%10==no){
						count++;
					}
			
			}
		System.out.println(count);
		}
	}
}
	
		