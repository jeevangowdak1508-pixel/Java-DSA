import java.util.*;
public class home5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 or 1 to continue");
        int button = sc.nextInt();
        switch (button) {
            case 1: if(button == 1){
                System.out.println("Enter Marks: ");
                int Marks = sc.nextInt();
                if(Marks>=90){
                    System.out.println("This is good");
                }
                else if(Marks>=60 && Marks<=80){
                    System.out.println("this is also good");
                }
                else if (Marks>=0 && Marks<=59){
                    System.out.println("This is good as well");
                }
            }
                break;
            case 2: if(button == 0)
                break;
            default:
                break;
        }
        sc.close();
    }
}
