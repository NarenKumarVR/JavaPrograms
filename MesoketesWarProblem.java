import java.util.*;
// class Battle
// {
//     char direction;
//     int strength;
//     public void Battle(char direction, int strength)
//     {
//         this.direction = direction;
//         this.strength = strength;
//     }
// }
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        // ArrayList<Battle> arr= new ArrayList<Battle>();
        
        String str = sc.nextLine();
        String days[] = str.replaceAll("\\s+","").split(";");
            int count = 0;
                int nstrength=0, sstrength=0, wstrength=0, estrength=0;
        for(int i=0; i<days.length;i++)
        {
            String attack[] = days[i].replaceAll("\\s+","").split(":");
            for(int j=0; j<attack.length;j++)
            {
                String components[] = attack[j].replaceAll("\\s+","").split("-");
                char direction = components[1].charAt(0);
                int strength = Integer.parseInt(components[3].charAt(0)+"");
                // System.out.println("di"+direction);

                // System.out.println("strength"+strength);            
            
            
                
                // System.out.println("direction======"+direction);
                // System.out.println("strength======="+strength);
              //  arr.add(direction, strength);
                if(direction=='N')
                {
                    //System.out.println("NIN"+count);
                    if(nstrength>strength)
                    {
                        //count--;
                        nstrength = strength;
                    }
                    else if(nstrength<strength)
                    {
                        count++;
                        nstrength = strength;
                    }
                }
                else if(direction=='S')
                {
                    //System.out.println("SIN"+count);
                    if(sstrength>strength)
                    {
                        //count--;
                        sstrength = strength;
                    }
                    else if(sstrength<strength)
                    {
                        count++;
                        sstrength = strength;
                    }
                }
                else if(direction=='W')
                {
                    // System.out.println("WIN"+count);
                    if(wstrength>strength)
                    {
                        // count--;
                        wstrength = strength;
                    }
                    else if(wstrength<strength)
                    {
                        count++;
                        wstrength = strength;
                    }
                }
                else if(direction=='E')
                {
                    // System.out.println("EIN"+count);
                    if(estrength>strength)
                    {
                        // count--;
                        estrength = strength;
                    }
                    else if(estrength<strength)
                    {
                        count++;
                        estrength = strength;
                    }
                }
            }
        }
            System.out.println(count);
    }
}
