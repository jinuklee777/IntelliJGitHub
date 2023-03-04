package inherited.bad;

public class Teacher {
    public String name;
    public int age;
    public String subject;

    public Teacher(String name, int age, String subject) {
        this.name = name;
        this.age = age;
        this.subject = subject;
    }

    public String getDetails() {
        return "이름: " + this.name + ", 나이: " + this.age + ", 과목: " + this.subject;
    }
}
