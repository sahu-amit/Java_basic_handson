package ClassAndObjects;

public class Student1 {
    String name;
    int marks1;
    int marks2;
    int marks3;

    int calculateTotal(){
        return marks1+marks2+marks3;
    }
}
class Stdnt{
    static void main(String[] args) {
        Student1 st = new Student1();
        st.name = "Aman";
        st.marks1 = 95;
        st.marks2 = 93;
        st.marks3 = 91;

        System.out.println("Total marks of "+st.name+" out of 300: "+st.calculateTotal());

    }
}
