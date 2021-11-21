import java.util.Scanner;

public class check {

    int checkno(int n)

     {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int b[]=new int[a];
        for (int i=0;i<a;i++){
           b[i]=sc.nextInt();
        }
        for (int i=0;i<a;i++){
            if (b[i]==n){
                return b[i];
            }
            else{
                return -1;
            }
        }

         return a;
     }}
class test1{
    public static void main(String[] args) {
        check obj=new check();
        System.out.println(obj.checkno(5));
    }

}
