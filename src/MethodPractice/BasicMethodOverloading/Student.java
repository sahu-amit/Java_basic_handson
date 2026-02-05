package MethodPractice.BasicMethodOverloading;

public class Student {
    public static void display(){
        String name = "Amit";
        int age = 30;
        String isStudying = "YES";
        System.out.println("Name of Student is: "+name);
        System.out.println("Age of Student is: "+age);
        System.out.println("Is still studying: "+isStudying);
    }
    public static void display(boolean showMarks){
        if(showMarks==true){
            int num = 85;
            System.out.println("Marks of Student is: "+num);
        }
        else {
            System.out.println("Condition is false");
        }
    }

    public static void main(String[] args) {
        display();
        display(true);
    }
}
