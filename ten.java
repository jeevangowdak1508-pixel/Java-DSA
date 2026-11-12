import java.util.*;
public class ten {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value: ");
        int n = sc.nextInt();
        for(int i=1;i<n+1;i++){
            sum+=i;
        }
        System.out.println(sum);
        sc.close();
    }
}
