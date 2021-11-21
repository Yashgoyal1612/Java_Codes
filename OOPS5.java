public class calculator {
    static double powerInt(int num1, int num2){
        return Math.pow(num1,num2);
    }
    static double powerDouble(double num1, int num2){
        return Math.pow(num1,num2);
    }
}
class test10{
    public static void main(String[] args) {
        calculator obj = new calculator();
        System.out.println(obj.powerInt(12,34));
        System.out.println(obj.powerDouble(456,65));
    }
}
