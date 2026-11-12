import java.util.*;
public class eighteen {
    public static void printMyName(String name){
        System.out.println(name);
    }
    public static void main(String[] args) {
        System.out.println("Enter your Name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        printMyName(name);
        sc.close();
    } 
}
