// for update there are two conditions,for zero its same as clearbit and for 1 its same as setbit
// update the 2nd bit(pos=1) of a number n to 1 (n=0101)
import java.util.*;
public class bitUpdate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter operation number: ");
        int oper = sc.nextInt();
        int n=5;
        int pos = 1;
        int bitMask = 1<<pos;
        if(oper==1){
            int newNumber = bitMask|n;
            System.out.println(newNumber);
        }else{
            int notbitMask = ~(bitMask);
            int newNumber = notbitMask&n;
            System.out.println(newNumber);
        }
        sc.close();
    }
}
