package ClassAndObjects;

public class Bird {
    String name;
    boolean canFly;
    String wingspan;
}
class BirdTest{
    static void main(String[] args) {
        Bird brd = new Bird();
        brd.name = "Dalmatian Pelican";
        brd.canFly = true;
        brd.wingspan = "3.2m long";
    }
}
