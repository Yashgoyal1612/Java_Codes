public class Programming {
    void display(){
        System.out.println("I love programming languages");
    }
    void display(String name){
        System.out.println("I love "+name);
    }
}
class test7{
    public static void main(String[] args) {
        Programming obj=new Programming();
        obj.display();
        obj.display("java and python");
    }
}
