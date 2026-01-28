package ClassAndObjects;

public class Box {
    double length;
    double width;
    double height;

    double volume(){
        return length * width * height;
    }
}
class Bx{
    static void main(String[] args) {
        Box box = new Box();
        box.length = 15.10;
        box.width = 10.25;
        box.height = 19;

        System.out.println("Volume of Box in is: "+box.volume()+" cube cm");
    }
}
