public class employee {
    void imformation(String name,int yrofJoining,String address){
        System.out.println("Name     "+"Year of Joining     "+"Address");
        System.out.println(name+"     "+yrofJoining+"     "+address);
    }
}
class test11{
    public static void main(String[] args) {
        employee obj=new employee();
        obj.imformation("sar",2020,"absgdgd");
    }
}
