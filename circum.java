import java.util.*;
public class circum {
    public static void circumference(float r){
        float pi=3.14f;
        float circumference = 2*pi*r;
        System.out.println(circumference);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        int r = sc.nextInt();
        circumference(r);
        sc.close();
    }
}
