public class AddAmount {
    int amt=50;
     AddAmount(){
         System.out.println(amt);
    }
    AddAmount(int amt1){
         amt=amt+amt1;
        System.out.println(amt);
    }
}
class test8{
    public static void main(String[] args) {
        AddAmount obj = new AddAmount(50);
    }
}
