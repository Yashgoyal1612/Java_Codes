public class palindrome {
    int n;
    void palindrome(int n){
        int rev=0;
        int rem;
        int m=n;

        while (n!=0){
            rem=n%10;
            rev=rev*10+ rem;
            n=n/10;

        }
        System.out.println(rev);
        if (rev==m){
            System.out.println("palindrome number");

        }
        else{
            System.out.println("not a palindrome number");
        }

    }
}
class test{
    public static void main(String[] args) {
        palindrome obj=new palindrome();
        obj.palindrome(676);
    }
}
