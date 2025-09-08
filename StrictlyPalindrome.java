import java.util.Scanner;
public class StrictlyPalindrome {
    public static boolean StrictPalindrome(String s){
        s=s.replaceAll("[^a-zA-Z]","").toLowerCase();
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j))
            return false;
            i++;
            j--;
        }
        return true;
    }
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String str;
    System.out.print("Enter a string: ");
    str=sc.nextLine();
    StrictPalindrome(str);
    if(StrictPalindrome(str)==true)
    System.out.println("Palindrome");
    else 
    System.out.println("Not Palindrome");
    sc.close();
}     

}

