import java.io.*;
import java.util.Scanner;
public class dominator
	{
		public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			int size,count=0;
			int num[]=new int[100];
			int n[]=new int[100];
			int temp[]=new int[100];
			System.out.println("Enter size of array");
			size = sc.nextInt();
			System.out.println("Enter elements");
			for(int i=0;i<size;i++)
			{
				n[i]=sc.nextInt();
			}
			temp=n;
			for(int j=0;j<size;j++)
			{
				for(int k=0;k<size;k++)
				{			
					while(j!=k)
					{	
						if(temp[j]==temp[k])
						{
							num[j]=temp[j];
							count++;
						}
						
					}
System.out.println("C"+count);
				}
			}
			if(count>=(size/2))
			{
				System.out.println("The num"+num+"is Dominator");
			}
		}
	}

