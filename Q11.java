
import java.util.*;
public class q11 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(	System.in);
        System.out.println(" Enter the total no. of paths you want to compare for :");
		int n=sc.nextInt();

		
		int xi,yi,xf,yf;
		double d2=0;
		double ar[]=new double[n];
		for(int i=0;i<n;i++)
		{
            System.out.println("Enter the constraints for "+(i+1)+" path");
            System.out.println("Enter X and Y coordinates of Initial position:");  
			xi=sc.nextInt();
			 yi=sc.nextInt();
             System.out.println("Enter X and Y coordinates of Final position:");
			 xf=sc.nextInt();
			yf=sc.nextInt();
			
			double d1=Math.sqrt((Math.pow(Math.abs(xi-xf),2))+ (Math.pow(Math.abs(yi-yf),2)));
			//System.out.println(d1);
	       ar[i]=d1;
			
			}
		 d2=ar[0];
		 int n1=0;
	for(int i=0;i<n;i++)
	{
        System.out.println(ar[i]+" Units Distance will be covered in path "+(i+1));
		if(ar[i]<d2)
		{
			d2=ar[i];
			n1=i;
		}
	}
		System.out.println(" You should go with path: " +(n1+1));
		sc.close();
	}

}
