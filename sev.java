import java.util.*;
public class sev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        // if(button == 1){
        //     System.out.println("Hello");
        // }
        // else if(button ==2){
        //     System.out.println("Namaskara");
        // }
        // else if(button ==3){
        //     System.out.println("Bonjour");
        // }
        // else{
        //     System.out.println("Invalid button!!");
        // }
        switch (button) {
            case 1:System.out.println("Hello");
                break;
            case 2:System.out.println("Namaskara");
                break;
            case 3:System.out.println("Bonjour");
                break;
            case 4:System.out.println("Invalid Button!!");
                break;
            default:
                break;
        }
        sc.close();
    }
}
