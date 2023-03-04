package inherited.good;

public class Student extends Person{
    public int studentId;
    public Student(String name, int age, int studentId) {
        super(name,age);
        this.studentId = studentId;
    }
    public String getDetails() {
        return super.getDetails()+", 학번: "+studentId;
    }
}
