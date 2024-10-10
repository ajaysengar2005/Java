public class StaticModifier {

    static int totalStudents = 0;
    String name;
    double cgpa;
    public StaticModifier(String name ,double cgpa){
        this.name = name;
        this.cgpa = cgpa;
        totalStudents++;
    }
    public static int getTotalStudent(){
        return totalStudents;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setCGPA(double cgpa){
        this.cgpa = cgpa;
    }
    public double getCGPA(){
        return cgpa;
    }
    public static void main(String[] args) {
        StaticModifier student1 = new StaticModifier("Ajay", 9.6);
        StaticModifier student2 = new StaticModifier("Abdul", 8.4);
        StaticModifier student3 = new StaticModifier("Siddharth", 7.8);
        System.out.println("Total Nunber of Students : "+ StaticModifier.getTotalStudent());
        System.out.println("Student 1 : "+ student1.getName()+ " CGPA "+student1.getCGPA());
        System.out.println("Student 2 : "+ student2.getName()+ " CGPA "+student2.getCGPA());
        System.out.println("Student 3 : "+ student3.getName()+ " CGPA "+student3.getCGPA());
        student2.setCGPA(8.6);
        System.out.println("Updated CGPA for Student 2 : "+student2.getCGPA());
    }
}
