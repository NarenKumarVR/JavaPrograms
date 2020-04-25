// You are using Java
import java.util.*;
class Main
{  
    static int count=0;
    static boolean recursion(String n,List <String> left,List<String> right){
        if(!left.contains(n)){
            return false;
        }
        if(left.contains(n)){
            count++;
            //System.out.println("Con "+n);
            String rightsplit[]=right.get(left.indexOf(n)).split("\\+");
            for(int i=0;i<rightsplit.length;i++){
                recursion(rightsplit[i],left,right);
            }
        }
        return false;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		ArrayList <String> left=new ArrayList<>();
		ArrayList <String> right=new ArrayList<>();
		ArrayList<String> userneed=new ArrayList<>();
		for(int i=0;i<n;i++){
		    String chem=sc.nextLine().replaceAll("\\s+","");
		    String ch[]=chem.split("=");
		    left.add(ch[0]);
		    right.add(ch[1]);
		}
		int need=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<need;i++){
		    String needchem=sc.nextLine();
		    if ( !userneed.contains(needchem) ){
		        userneed.add(needchem);
		        recursion(needchem,left,right);
		    }
		}
	    System.out.println(count);
	}
}
