public class q4{
    static class Student{
        String name;
        int marks;

    
    public Student(String name, int marks){
        this.marks = marks;
        this.name = name;
    }

    }
    public static void main(String[] args){
        Student s1=new Student("saurabh",90);
        Student s2=new Student("tejas",92);
        System.out.println(s1.name+" "+s2.name);
    }
    
}