package ClassAndObjects;

public class Course {
    String courseName;
    int duration;
    int fee;
}

class Crse{
    public static void main(String[] args) {
        Course course = new Course();
        course.courseName = "Data Science";
        course.duration = 730;
        course.fee = 160000;

        System.out.println("Name of the Course is: "+course.courseName);
        System.out.println("Duration of the "+course.courseName+"Course is: "+course.duration+" days");
        System.out.println("Fee of the "+course.courseName+"Course is: "+course.fee+ "₹");
    }
}
