package oops.inheritance.simple;

public class PermanentEmployee extends Employee {
    float basicSalary;
    float hra;
    float da;

    public PermanentEmployee() {
        super();  //super call can be called once and only in the first line
        System.out.println("Permanent Employee");

    }

    public PermanentEmployee(int id, String name, float basicSalary) {
        super(id,name);
        this.basicSalary = basicSalary;
    }

    @Override
    void calculateSalary(){
        hra = basicSalary * 0.12f;
        da = basicSalary * 0.1f;
        salary = basicSalary + hra + da;

    }

    @Override
    void display(){
        super.display();   //here super is keyword
        System.out.println("Basic Salary= " + basicSalary);
        System.out.println("HRA= " + hra);
        System.out.println("DA= " + da);
    }
}
