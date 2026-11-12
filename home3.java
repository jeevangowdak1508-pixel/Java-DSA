import java.util.*;
public class home3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value: ");
        int n = sc.nextInt();
        int sum=0;
        for(int i=0;i<n+1;i++){
            if(i%2==0){
                sum+=i;
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
