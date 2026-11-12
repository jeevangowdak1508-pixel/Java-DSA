import java.util.*;
public class twenty {
    public static int CalcMul(int a,int b){
        return a*b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
            int a = sc.nextInt();
            System.out.println("Enter b : ");
            int b = sc.nextInt();
            int result = CalcMul(a,b);
            System.out.println("Product of 2 numbers is : "+ result);
            sc.close();
        }
    }

