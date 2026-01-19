package ClassAndObjects;

public class Employee {

    int id;
    String name;
    int salary;
    void display(){
        System.out.println("Id of the Employee is: "+id);
        System.out.println("Name of the Employee is: "+name);
        System.out.println("Salary of the Employee is: "+salary);
    }
}

class Emply{
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.id = 123654;
        emp.name = "Shankar Mahadev";
        emp.salary = 51546;
        emp.display();
    }
}