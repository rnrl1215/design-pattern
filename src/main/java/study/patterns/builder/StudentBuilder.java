package study.patterns.builder;

public class StudentBuilder {
    private Student student;

    private StudentBuilder() {
        student = new Student("",0,0);
    }

    public static StudentBuilder start() {
        return new StudentBuilder();
    }

    public StudentBuilder setName(String name) {
        student.setName(name);
        return this;
    }

    public StudentBuilder setAge(int age) {
        student.setAge(age);
        return this;
    }

    public StudentBuilder setGrade(int grade) {
        student.setGrade(grade);
        return this;
    }

    public Student build() {
        return student;
    }

}
