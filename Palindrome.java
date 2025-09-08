import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str;
        System.out.print("Enter a String: ");
        str=sc.nextLine();
        CheckPalindrome(str);
        if(CheckPalindrome(str)==true)
        System.out.println("Palindrome");
        else
        System.out.println("Not Palindrome");
        sc.close();
    }
    
    public static boolean CheckPalindrome(String s)
    {
        int i=0,j=s.length()-1;
        while (i<j) {
            if(s.charAt(i)!=s.charAt(j))
            return false;
            i++;
            j--;
        }
        return true;
    }
    
}
