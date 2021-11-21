import java.util.Scanner;

public class element {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int b[]=new int[n];
        for (int i=0;i<n;i++){
            b[i]=sc.nextInt();
        }
        for (int i=0;i<n;i++){
            if (b[i]==1 || b[i]==4){
                System.out.println("ture");
            }
            else{
                System.out.println("false");
            }
        }
    }
}
