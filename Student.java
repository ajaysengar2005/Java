public class Student {
    String name;
    int age;
    String studentId;
    
    public Student(){
        this.name = "Unknown";
        this.age = 0;
        this.studentId = "Unknown";

    }
    public Student(String name , int age , String studentId){
        this.name = name;
        this.age = age;
        this.studentId  =  studentId;
    }
    public Student(String name, int age){
        this.name = name;
        this.age = age;
        this.studentId = "Not Assigned";

    }
    void displayDetails(){
        System.out.println("NAME :" + name);
        System.out.println("AGE :" + age);
        System.out.println("STUDENT ID :" + studentId);
    }

   public static void main(String[] args){
    Student student1    = new Student();
    System.out.println("Student 1 Details  :");
    student1.displayDetails();
    Student student2 = new Student("Ajay",19,"S23120193");
    System.out.println("\nStudent 2 Details  :");
    student2.displayDetails();
    Student student3 = new Student("Abdul",23,"S23120054");
    System.out.println("\nStudent 3 Details  :");
    student3.displayDetails();


   }

}
