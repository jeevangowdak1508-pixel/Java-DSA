import java.util.*;
public class spiral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter no. of col: ");
        int col = sc.nextInt();
        int numbers[][] = new int[rows][col];
        System.out.println("Engter the elements: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                numbers[i][j]=sc.nextInt();
            }
        }
        int startrow=0,startcol=0,endrow=rows-1,endcol=col-1;
        while(startrow<=endrow&&startcol<=endcol){
        for(int j=startcol;j<=endcol;j++){
            System.out.print(numbers[startrow][j]+" ");
        }
        for(int i=startrow+1;i<=endrow;i++){
            System.out.print(numbers[i][endcol]+" ");
        }
        for(int j=endcol-1;j>=startcol;j--){
            if(startrow==endrow)
                break;
            System.out.print(numbers[endrow][j]+" ");
        }
        for(int i=endrow-1;i>startrow;i--){
            if(startcol==endcol)
                break;
            System.out.print(numbers[i][startcol]+" ");
        }
        startrow++;
        startcol++;
        endrow--;
        endcol--;
    }
    sc.close();
}
}
