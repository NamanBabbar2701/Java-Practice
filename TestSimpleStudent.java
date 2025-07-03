package oops.encapsulated;

public class TestSimpleStudent {
    public static void main(String[] args) {
        Student student = new Student();

        student.setId(10);
        System.out.println("Id=" +student.getId());
//        student.name = "Raj";
//        student.marks = 76.4f;

//        Student student1 = new Student(10,"Raj",76.4f);
//        student1.printDetails();
    }
}
