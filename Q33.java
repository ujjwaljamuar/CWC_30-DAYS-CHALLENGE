import java.util.*;
public class q33 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
        int n1=sc.nextInt();
        ArrayList<Integer> ob=new ArrayList<Integer>(n1);
        for(int j=0;j<n1;j++)
        {
            ob.add(sc.nextInt());
        
        }
        Collections.sort(ob);
        System.out.print(ob);
        }
        sc.close();
        }
    
}
