import java.util.*;
public class average {
    public static float avg(int a,int b,int c){
        float average = (a+b+c)/3.0f;
        return average;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();
        System.out.println("Enter c: ");
        int c = sc.nextInt();
        System.out.println("The Average is "+ avg(a,b,c));
        sc.close();
    }
}
