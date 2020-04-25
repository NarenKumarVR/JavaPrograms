// You are using Java
import java.util.*;
class M{
    static int dayWise(){
        String day_wise[]=war.split(";");
        for(String day:day_wise){
            int e=0,w=0,n=0,s=0;
            String attempt[]=day.split("T");
            for(int i=1;i<attempt.length;i++){
                attempt[i]=attempt[i].replace(":","");
                attempt[i]=attempt[i].replace(" ","");
                String alp=(attempt[i]);
                if(alp.contains("N") && Integer.parseInt(alp.substring(6,alp.length()))>north){
                    if(n<Integer.parseInt(alp.substring(6,alp.length()))){
                      n=Integer.parseInt(alp.substring(6,alp.length()));
                    }
                    win++;
                }
                if(alp.contains("E") && Integer.parseInt(alp.substring(6,alp.length()))>east){
                    if(e<Integer.parseInt(alp.substring(6,alp.length()))){
                        e=Integer.parseInt(alp.substring(6,alp.length()));
                    };
                    win++;
                }
                if(alp.contains("W") && Integer.parseInt(alp.substring(6,alp.length()))>west){
                    if(w<Integer.parseInt(alp.substring(6,alp.length()))){
                    w=Integer.parseInt(alp.substring(6,alp.length()));
                    }
                    win++;
                }
                if(alp.contains("S") && Integer.parseInt(alp.substring(6,alp.length()))>south){
                    if(n<Integer.parseInt(alp.substring(6,alp.length()))){
                        s=Integer.parseInt(alp.substring(6,alp.length()));
                    }
                    win++;
                } 
            }
            east+=e;
            west+=w;
            north+=n;
            south+=s;
        }
        return win;
    }
    static String war="";
    static int east=0;
    static int west=0;
    static int north=0;
    static int south=0;
    static int win=0;
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        war=sc.nextLine();
        int succ_attack=dayWise();
        System.out.println(succ_attack);
    }
}
