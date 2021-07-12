import java.util.Scanner;

public class q78 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p=sc.nextInt();
        int ar[]=new int[n];
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
       
        int temp=ar[p-1];
        ar[p-1]=ar[n-p];
        ar[n-p]=temp;
        for(int i=0;i<n;i++)
        {
            System.out.print(ar[i]+" ");

        }
        sc.close();


    }
}
