import java.util.*;
public class findx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n= sc.nextInt();
        int find[] = new int[5];
        System.out.println("Enter elements: ");
        for(int i=0;i<n;i++){
            find[i]=sc.nextInt();
        }
        System.out.println("Enter the element to be found: ");
        int x = sc.nextInt();
        for(int i=0;i<n;i++){
            if(find[i]==x){
                System.out.println("Array element found at index: "+i);
            }
        }
        sc.close();
    }
}
