import java.util.*;
public class table {
    public static void tables(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n+" X "+i+" = "+ n*i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the n value: ");
        int n = sc.nextInt();
        tables(n);
        sc.close();
    }
}
