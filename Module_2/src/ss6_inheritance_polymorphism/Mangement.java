package ss6_inheritance_polymorphism;

public class Mangement {
    public static void main(String[] args) {
        SuperClass sc1 = new SuperClass(15, "Linh");
        SuperClass sc2 = new SuperClass(17, "Jone");
        SuperClass sc3 = new SuperClass(19, "loz");


        System.out.println(sc1.getAge());
    }
}
