package oops.array;

public class Student {
        private int id ;
        private String name ;
        private float[] marks ;
        private float percentage;
        private char grade;

        public Student(int id , String name , float[] marks){
            this.id = id;
            this.name = name;
            this.marks = marks;
        }


    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float[] getMarks() {
        return marks;
    }

    public void setMarks(float[] marks) {
        this.marks = marks;
    }

    public float getPercentage(){
        if(marks == null || marks.length == 0)
            return 0;
        float total = 0f;
        for(float mark: marks)
            total += mark;
        percentage = (float) (total/marks.length);
        return percentage;
    }

    public char getGrade(){
            float percentage = getPercentage();
            if(percentage >= 90)
                return grade = 'A';
            else if(percentage >= 80)
                return grade = 'B';
            else if(percentage >= 70)
                return grade = 'C';
            else if(percentage >= 60)
                return grade = 'D';
            else
                return grade = 'F';

    }

    public void printStudentDetails(){
        System.out.println("====Printing Student Details====");
        System.out.println("Id= " + id);
        System.out.println("Name= " + name);
        System.out.print("Marks= ");
        if(marks != null){
            for(float mark : marks){
                System.out.println(mark + " ");
            }
        }else{
            System.out.println("No marks available");
        }
        System.out.println();
        System.out.println("Percentage:" + percentage + " % ");
        System.out.println("Grade= " + grade);
    }
}
