import package1.Service;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        Person p1 = new Person("bryan");
        System.out.println(p1.getName());
        Service s1 = new Service("Service1");
        System.out.println(s1.getName());

    }
}