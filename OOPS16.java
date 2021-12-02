public class Student {
    String name;
    int age;
    String address;
    Student(){
        name="Unknown";
        age=0;
        address="not available";
        System.out.println(name);
        System.out.println(age);
        System.out.println(address);
    }
    void setInfo(String name,int age){
        System.out.println(name);
        System.out.println(age);
    }
    void setInfo(String name,int age,String address){
        System.out.println(name);
        System.out.println(age);
        System.out.println(address);
    }
}
class test9{
    public static void main(String[] args) {
        Student obj = new Student();
        obj.setInfo("Yash",12);
    }
}
