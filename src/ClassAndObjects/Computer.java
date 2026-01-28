package ClassAndObjects;

public class Computer {
    String brand;
    String processor;
    int ram;

    void displayComputerDetails(){
        System.out.println("Computer Brand: "+brand);
        System.out.println("Computer Processor: "+processor);
        System.out.println("Computer RAM: "+ram+" GB");
    }
}
class ComputerTest{
    static void main(String[] args) {
        Computer cmp = new Computer();
        cmp.brand = "HP";
        cmp.processor = "Intel Core i5 13th Gen";
        cmp.ram = 32;
        cmp.displayComputerDetails();
    }
}
