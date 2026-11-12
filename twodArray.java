import java.util.*;
public class twodArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no. of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the no. of columnns: ");
        int col = sc.nextInt();
        int numbers[][] = new int[rows][col];
        System.out.println("Enter the elements: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                numbers[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
