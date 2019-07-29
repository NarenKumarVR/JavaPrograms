import java.io.*;
import java.util.Scanner;

public class Parentheses{
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);	
	
		String s1 = sc.next();int a = 0,b = 0;

		for(int i = 0; i < s1.length() ; i++){

			if( s1.charAt(i) == '('){

				a++;
			}
			else if(s1.charAt(i) == ')'){

				b++;
			}
		}

		if( a == b ){

			System.out.println(true);
		}
		else{

			System.out.println(false);
		}
	}
}