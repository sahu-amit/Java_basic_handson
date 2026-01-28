package MethodPractice.MethodsWithReturnTypes;

public class RectangleWithReturnType {
    static int getArea(int l, int w){
        return l*w;
//        return area;
    }

    public static void main(String[] args) {
        System.out.print("Area of Rectangle is: "+getArea(13, 64));
//        System.out.println(area);
    }
}
