package oops.array;
import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Id: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter number of subjects: ");
        int n = scanner.nextInt();

        float[] marks = new float[n];
        for(int i = 0 ; i < n ; i++){
            System.out.println("Enter marks of subject " + (i+1) + " : ");
            marks[i] = scanner.nextFloat();
        }

        Student student = new Student(id , name , marks);
        student.getPercentage();
        student.getGrade();
        student.printStudentDetails();

    }
}
