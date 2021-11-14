public class Student {
    Student(){
        System.out.println("Unknown");
    }
    Student(String name){
        System.out.println(name);

    }
}
class test{
    public static void main(String[] args) {
        Student obj=new Student();
    }
}
