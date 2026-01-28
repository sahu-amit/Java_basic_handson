package ClassAndObjects;

public class Animal {
    String name;
    String type;
    String sound;
}

class Anml{
    static void main(String[] args) {
        Animal animal = new Animal();
        animal.name = "Dog";
        animal.type = "Kombai Dog";
        animal.sound = "Bhoun Bhoun";

        System.out.println("Name of the Animal is: "+animal.name);
        System.out.println("Type of the Animal is: "+animal.type);
        System.out.println("Sound of the Animal is: "+animal.sound);
    }
}
