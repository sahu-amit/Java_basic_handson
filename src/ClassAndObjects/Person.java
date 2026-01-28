package ClassAndObjects;

public class Person {
    String name;
    int age;
    String city;
}

class Prsn{
    static void main(String[] args) {
        Person person = new Person();
        person.name = "Rajesh";
        person.age = 35;
        person.city = "Bangalore";

        System.out.println("Name of the Person is: "+person.name);
        System.out.println("Age(in years) of the Person is: "+person.age);
        System.out.println("City of the Person is: "+person.city);
    }
}
