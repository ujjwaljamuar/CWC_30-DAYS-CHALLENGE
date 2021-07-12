import java.util.*;
public class q29 {

    public static void main(String args[])
    { Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
    int t; 
    double s=0,b=.5,d=.5; 
    for(t=1;t<=n;t++)
     {
     if(t<n)
     System.out.print(b+" + ");
     else
     System.out.print(b);
     s=s+b;
    d=d/10;
    b=b+d;
    }
    System.out.println();
    System.out.print(" The sum= "+s);
    sc.close();
    }}
    