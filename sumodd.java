import java.util.*;
public class sumodd {
    public static int sumofOdd(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                sum+=i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value: ");
        int n = sc.nextInt();
        int result = sumofOdd(n);
        System.out.println(result);
        sc.close();
    }
}
