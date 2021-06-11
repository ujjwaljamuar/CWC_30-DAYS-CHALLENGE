//Calculate the area of a Circle inscribed in a Square.
package challenge;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the side of the Square : ");
        double a=sc.nextDouble();   // side of the square
        double r=a/2;            // radius of the circle
        System.out.println("Radius of the cicle inscribed will be : "+r);
        double area=(Math.PI)*(Math.pow(r, 2));
        System.out.println("Area of the circle inscribed is : "+area);

        sc.close(); 
    }
}
