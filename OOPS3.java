public class box {
    int length;
    int breadth;
    int height;
    box(int l,int b,int h){
        length=l;
        breadth=b;
        height=h;


    }int volume(int length, int breadth, int height){
        int v=length*breadth*height;
        return v;
    }

}
class test3{
    public static void main(String[] args) {
        box obj=new box(2,3,4);

    }
}
