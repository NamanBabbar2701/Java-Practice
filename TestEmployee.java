package oops.inheritance.simple;

public class TestEmployee {
    public static void main(String[] args) {
        PermanentEmployee permanentEmployee = new PermanentEmployee(111 , "Naman Babbar" , 25000f);
//        permanentEmployee.id = 101;
//        permanentEmployee.name = "Naman Babbar";
//        permanentEmployee.basicSalary = 10000f;
//
//
        permanentEmployee.calculateSalary();
        permanentEmployee.display();
    }
}
