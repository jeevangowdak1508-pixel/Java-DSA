import java.util.*;
public class arrname {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        String names[] = new String[4];
        System.out.println("Enter names: ");
        for(int i=0;i<n;i++){
            names[i]=sc.next();
        }
        for(int i=0;i<n;i++){
            System.out.print("Name " +(i+1)+" is: " + names[i]+" ");
        }
        sc.close();
    }
}
