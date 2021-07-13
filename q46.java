import java.util.Scanner;
public class q46 {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
	    double a =sc.nextDouble();
	    double b =sc.nextDouble();
	    double c =sc.nextDouble();
	    double r1, r2;

	    double det = b * b - 4 * a * c;
        if (det == 0) {

            r1 =  -b / (2 * a);
            r2=r1;
           System.out.println("root1 "+r1);
           System.out.println("root2 "+r2);

          }

	    else if (det > 0) 
        {
	      r1 = (-b + Math.sqrt(det)) / (2 * a);
	      r2 = (-b - Math.sqrt(det)) / (2 * a);
          System.out.println("root1 "+r1);
          System.out.println("root2 "+r2);
	     }
	    else 
        {
	        double real = -b / (2 * a);
	        double imaginary = Math.sqrt(-det / (2 * a));
	        System.out.println("root 1 : "+real+ " + "+imaginary+"i");
            System.out.println("root 2 : "+real+ " - "+imaginary+"i");
       }
}}