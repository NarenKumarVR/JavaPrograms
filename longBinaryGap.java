import java.io.*;
import java.util.Scanner;
public class longBinaryGap
{
	public static void main(String args[])
	{
		int n,rem = 0,count=0;
		Scanner sc=new Scanner(System.in);			
		System.out.println("Enter number");
		n = sc.nextInt();
		String bin = Integer.toBinaryString(n);
		System.out.println("Binary="+bin);
		
		for(int i=0;i<bin.length();i++)
		{	
			if(bin.charAt(i)=='0')
			{
				count++;
			}
			else
			{
				System.out.println(" ");
			}
		}
		System.out.println(" Count="+count);
	}
	
}					
								
		