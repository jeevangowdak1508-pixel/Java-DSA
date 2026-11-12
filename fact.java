import java.util.*;
public class fact {
    public static void factorial(int n){
        int fact=1;
        if(n<0){
            System.out.println("Invalid number");
            return;
        }
        for(int i=n;i>0;i--){
            fact=fact*i;
        }
        System.out.println(fact);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value: ");
        int n = sc.nextInt();
        System.out.println("factorial of given number is: ");
        factorial(n);
        sc.close();
    }
}
