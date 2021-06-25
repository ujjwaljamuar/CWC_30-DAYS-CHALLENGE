package challenge;
// Write a program to evaluate the function sin(x) as defined by the infinite series expansion.
import java.util.Scanner;
public class Q73 {
    static void cal_sin(float n)
{    
    float accuracy = (float) 0.0001, denominator, sinx, sinval;
     
    // Converting degrees to radian
    n = n * (float)(3.142 / 180.0);
 
    float x1 = n;
     
    // maps the sum along the series
    sinx = n;        
     
    // holds the actual value of sin(n)
    sinval = (float)Math.sin(n);    
    int i = 1;
    do
    {
        denominator = 2 * i * (2 * i + 1);
        x1 = -x1 * n * n / denominator;
        sinx = sinx + x1;
        i = i + 1;
    } while (accuracy <= sinval - sinx);
       System.out.println(sinx);
}
 
    public static void main(String[] args) {
        float n = 90;
    cal_sin(n);
     
    }
}