import java.util.Scanner;

public class twoDimensional {
    void check(int n){
        Scanner sc = new Scanner(System.in);
        int arr[][]=new int[n][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=n-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                System.out.print(arr[i][j]);
            }
            System.out.println();

        }
    }
}
class test4{
    public static void main(String[] args) {
        twoDimensional obj=new twoDimensional();
        obj.check(2);
    }
}
