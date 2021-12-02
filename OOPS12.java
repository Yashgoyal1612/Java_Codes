public class Car {
    String manufacturer;
    long price;
    String name;
    void cars(String name,String manufacturer,long price){
        System.out.println(name);
        System.out.println(manufacturer);
        System.out.println(price);
    }
}
class test5{
    public static void main(String[] args) {
        Car obj=new Car();
        obj.cars("audi","avsd",39087968);
    }
}
