package ClassAndObjects;

public class Fruit {
    String name;
    String color;
    double weight;
}

class Fr{
    public static void main(String[] args) {
        Fruit fruit = new Fruit();
        fruit.name = "Mango";
        fruit.color = "Radish Yellow";
        fruit.weight = 1.5;

        Fruit fruit1 = new Fruit();
        fruit1.name = "Papaya";
        fruit1.color = "Yellow";
        fruit1.weight = 1.25;

        System.out.println("Name of the Fruit is: "+fruit.name);
        System.out.println("Color of the Fruit is: "+fruit.color);
        System.out.println("Weight of the Fruit is(in kg) : "+fruit.weight);
        System.out.println();

        System.out.println("Name of the Fruit is: "+fruit1.name);
        System.out.println("Color of the Fruit is: "+fruit1.color);
        System.out.println("Weight of the Fruit is(in kg): "+fruit1.weight);
    }
}
