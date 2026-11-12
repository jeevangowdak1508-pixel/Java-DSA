// here we use and and not operation to the bitMask,then use and operation between bitmask and n
// clear the 3rd bit (pos=2) of a number n.(0101)
public class bitClear {
    public static void main(String[] args) {
        int n= 5;
        int pos = 2;
        int bitMask = 1<<pos;
        int notbitMask = ~(bitMask);
        int newNumber = notbitMask&n;
        System.out.println(newNumber);

    }
}
