package collectionAPI.assignments;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class AttendanceTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> attendanceList = new ArrayList<>();
        boolean running = true;


        while(running){
            System.out.println("\n===Student Attendance Tracker===");
            System.out.println("1.Add a student");
            System.out.println("2.Remove a student");
            System.out.println("3.Display Attendance List");
            System.out.println("4.Exit");
            System.out.println("Enter your choice between 1-4: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    System.out.println("Enter student name to add: ");
                    String name = scanner.nextLine();
                    attendanceList.add(new Student(name));
                    System.out.println(name + " marked present");
                    break;
                case 2:
                    System.out.println("Enter student to remove: ");
                    int index = scanner.nextInt();
                    scanner.nextLine();
                    if(index > 0 && index <= attendanceList.size()){
                        Student removed = attendanceList.remove(index - 1);
                        System.out.println(removed.getName() + " is removed from the list");
                    }else{
                        System.out.println("Invalid Index");
                    }
                    break;
                case 3:
                    System.out.println("Final Attendance List");
                    Iterator<Student> iterator = attendanceList.iterator();
                    int i = 1;
                    while(iterator.hasNext()){
                        Student student = iterator.next();
                        System.out.println(i++ + ". " + student.getName());
                    }
                    break;
                case 4:
                    running = false;
                    System.out.println("Exiting.... Have a great day!");
                    break;
                default:
                    System.out.println("Enter a valid Choice!");

            }
        }
    }

}
