package challenge;
// Write a program to input a number and check and print whether it is a Pronic number or not. (Pronic number is the number which is the product of two consecutive integers).
import java.util.Scanner;
public class Q26 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n=sc.nextInt();
        int i=0;
        while(i*(i+1)< n){
            i++;
        }
        if(i*(i+1)==n){
            System.out.println(n+" is a Pronic Number");
        }
        else{
            System.out.println(n+" is Not a Pronic Number");
        }
    }
}
