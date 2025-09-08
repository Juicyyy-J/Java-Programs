import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
     
    Scanner sc=new Scanner(System.in);
    int first=0,second=1,temp,n;
    System.out.print("Enter a number: ");
    n=sc.nextInt();
    if(n>2)
    {
        System.out.print(first+ " ");
        System.out.print(second+ " ");
        for(int i=1;i<=n-2;i++)
        {
            temp=first+second;
            System.out.print(temp+ " ");
            first=second;
            second=temp;
            
        }
    }    
    sc.close();
}
}