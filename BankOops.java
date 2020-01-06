import java.util.*;

class Input
{
    String name,addr,p_num,s_num;
    int bal , with_amt , dep_amt;
    public Input(String p_num,String s_num)
    {
        this.name = name;
        this.addr = addr;
        this.p_num = p_num;
        this.s_num = s_num;
    }

}

public class Main
{
    
    //public static HashMap<String,Input> hm = new HashMap<>();
    public static void main(String args[])
    {
        Main main=new Main();
        Scanner sc = new Scanner(System.in);
        int cond;
        bal = 7000 , with_amt = 0 , dep_amt = 0;
        int ch;
        do
        {
            System.out.println("1.Enter Customer Credentials");
            String name = sc.next();
            String addr = sc.nextLine();
            String p_num = sc.next();
            String s_num = sc.next();

            
            if(ch==1){
                String name = sc.next();
                String addr = sc.nextLine();
                String p_num = sc.next();
                String s_num = sc.next();
            }
            System.out.println("2.Withdraw");
            else if(ch==2){
                
                 main.withdraw();
            }
            System.out.println("3.Deposit");
            else if(ch==3){
                main.deposit();
            }
            System.out.println("4.GetBalance");
            else if(ch==4){
                main.getBalance();
            }
            System.out.println("5.exit");
        }while(ch!=5);
        
    }

    void display()
    {
        Iterator ir = hm.entrySet().iterator();
        while(ir.hasNext())
        {
            Map.Entry<String,Input> temp = (Map.Entry) ir.next();
            String nm = temp.getKey();
            Input ph = temp.getValue();
            System.out.println("Name : "+nm+"\tPrimary Number : "+ph.p_num+"\tSecondary Number: "+ph.s_num);
            
        }
    }
    
    void search()
    {
        int flag=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Search key");
        String key=sc.next();
        Iterator ir=hm.entrySet().iterator();
        while(ir.hasNext())
        {
            Map.Entry<String,Input> temp=(Map.Entry) ir.next();
            String nm=temp.getKey();
            Input ph=temp.getValue();
            
            String temp1 = nm;
            temp1=temp1.toUpperCase();
            //System.out.println(temp1);
            String temp2 = key;
            temp2=temp2.toUpperCase();
            //System.out.println(temp2);
            if(temp1.contains(temp2))
            {
                System.out.println("Name : "+nm+"\tPrimary Number : "+ph.p_num+"\tSecondary Number: "+ph.s_num);
                flag=1;
            }
            
        }
            if(flag==0)
            {
                System.out.println("No record exists");
            }
        
    }

}
