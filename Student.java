package oops.encapsulated;

public class Student {
    private int id;
    private String name;
    private float marks;

    public Student(){}     /* This is called as no arg constructor (if it is created by us)
                          if it is created by java itself then it is called Default Constructor */

    public Student(int id , String name , float marks){
        this.id = id;          //(instance_id  = local_id)
        this.name = name;     //(this : at time of calling which object is alive
        this.marks = marks;  //this will refer to the current object of the class)
    }

    public int getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMarks() {
        return marks;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }

    public void setId(int id){
        this.id = id;
    }

    void printDetails(){
        System.out.println("Id= " + id);
        System.out.println("Name= " + name);
        System.out.println("Marks= " + marks);
    }
}
