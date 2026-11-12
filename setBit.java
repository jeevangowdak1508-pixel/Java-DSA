// here we use or oepartion between n and bitMask
// set the 2nd bit(pos=1) of a number n.(n=0101)
public class setBit {
    public static void main(String[] args) {
        int n=5;
        int pos=1;
        int bitMask = 1<<pos;
        int newNumber = n | bitMask;
        System.out.println(newNumber);
    }
}
