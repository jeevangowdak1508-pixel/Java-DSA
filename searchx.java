import java.util.*;
public class searchx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the no. of col: ");
        int col = sc.nextInt();
        int numbers[][] = new int[rows][col];
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                numbers[i][j] = sc.nextInt();
            }
        }
        int x = sc.nextInt();
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                if(numbers[i][j]==x){
                    System.out.println("x found at index: (" + i + ","+ j +")");
                }
            }
        }
        sc.close();
    }
}
