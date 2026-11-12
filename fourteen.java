public class fourteen {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=n;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=0;i<n+1;i++){
            int num=1;
            for(int j=0;j<i+1;j++){
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
        System.out.println();
        for(int i=n;i>0;i--){
            int num=1;
            for(int j=0;j<i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
        System.out.println();
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        int num=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
        System.out.println();
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
