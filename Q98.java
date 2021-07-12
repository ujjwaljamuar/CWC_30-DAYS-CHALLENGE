import java.util.Scanner;
public class q98 
{
    public static void main(String args[])
    {
        //Scanner sc=new Scanner(System.in);
        //int n=sc.nextInt();
        int d, i,j,r,sum=0,sum1=0,f=1;
        for(i=3;i<=2540161;i++)
        {   sum=0;
            d=i;
        while(d>0)
        {
          r=d%10;
          f=1;
          for(j=1;j<=r;j++)
          {
              f=f*j;

          }
          
          sum=sum+f;
          d/=10;
        }
    
        if(sum==i)
        {
           // System.out.println(n+" valid");
           sum1=sum1+sum;
        }
        
        
        
    }
    System.out.println(sum1);
    
    }
}
