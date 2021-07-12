import java.util.*;
public class q28 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		double sum=0;
		int n1=n;
		for(int i=1;i<=n;i++)
		{
			sum=sum+Math.pow(i,n1);
			n1--;
		}
		System.out.println(sum);
        sc.close();
	}

}

