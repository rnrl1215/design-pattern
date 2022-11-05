package study.patterns.builder;

public class Main {
    public static void main(String[] args) {
        // 빌더 적용전
        Student student1 = new Student("name", 22,1);

        // 빌더 적용후
        Student student2;
        student2 = StudentBuilder.start()
                                .setName("student1")
                                .setAge(12)
                                .setGrade(1)
                                .build();

        System.out.println(student2.toString());
    }
}
