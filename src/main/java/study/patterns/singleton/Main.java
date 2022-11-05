package study.patterns.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        singleton1.setName("single1");
        singleton2.setName("single2");

        System.out.println("single1 name: "+singleton1.getName());
    }
}
