package com.company;

public class rectangle {
    int length;
    int breadth;
    rectangle(int length,int breadth ){
        this.length=length;
        this.breadth=breadth;
    }
    void area(){
        int area=length*breadth;
        System.out.println(area);
    }
}
class test12{
    public static void main(String[] args) {
        rectangle obj = new rectangle(5,4);
        obj.area();
    }
}
