import java.util.*;
public class evodd {
    public static void checkevodd(int n){
        if(n%2==0){
            System.out.println("The number is even");
        }
        else{
            System.out.println("The number is odd");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value: ");
        int n = sc.nextInt();
        checkevodd(n);
        sc.close();
    }
}
