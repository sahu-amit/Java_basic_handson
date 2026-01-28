package ClassAndObjects;

public class Dog {
    String name;
    String breed;
    int age;
}

class Main{
    static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.name = "Sheru";
        myDog.breed = "German Shepherd";
        myDog.age= 5;

        System.out.println("Name: "+myDog.name);
        System.out.println("Breed: "+myDog.breed);
        System.out.println("Age: "+myDog.age+" year");
    }
}
