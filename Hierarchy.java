import java.util.Scanner;

class Hierarchy{

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int pop_n, dean, prof, stu;
        System.out.println("Enter the population :");
        pop_n = sc.nextInt();

        dean = (pop_n - 1)/106;
        prof = 5 * dean;
        stu =  20 * dean;

        System.out.println("Principal :1");
        System.out.println("Deans :"+dean);
        System.out.println("Professors :"+prof);
        System.out.println("Students :"+stu);

        sc.close();
    }
}