public class seventeen {
    public static void main(String[] args) {
        int n=4;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            int stars=(2*(i+1))-1;
            for(int j=0;j<stars;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n-1;i>=0;i--){
            int stars=(2*(i+1))-1;
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<stars;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
