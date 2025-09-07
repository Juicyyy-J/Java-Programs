import java.util.Scanner;

import javax.swing.plaf.metal.MetalBorders.ScrollPaneBorder;
class OddEven
{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int num;
    System.out.print("Enter a number: ");
    num=sc.nextInt();
    if(num!=0)
    {
        if(num%2==0)
             System.out.println("Even Number");
        else 
        System.out.println("Odd Number");     
    }
    else
    System.out.println("Neither Odd nor Even");
}
}