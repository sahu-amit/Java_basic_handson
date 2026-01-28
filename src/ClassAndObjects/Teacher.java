package ClassAndObjects;

public class Teacher {
    String name;
    String subject;
    String experience;

    void displayTeacherDetails(){
        System.out.println("Teacher name: "+name);
        System.out.println(name+" teacher subject: "+subject);
        System.out.println(name+" teacher Experience: "+experience);
    }
}
class TeacherTest{
    static void main(String[] args) {
        Teacher tc = new Teacher();
        tc.name = "Roshni";
        tc.subject = "Math";
        tc.experience = "Excellent";

        tc.displayTeacherDetails();
    }
}
