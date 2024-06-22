package ss5_accessModifier.thuc_hanh;

public class Student {
        private int rollno;
        private String name;
        private static String college = "BBDIT";

        Student(int rollno, String name) {
            this.rollno = rollno;
            this.name = name;
        }

        static void change(){
            college = "CODYGYM";
        }

        void display(){
            System.out.println(rollno + " " + name + " " + college);
        }

        public static void main(String[] args) {
            Student.change();

            Student s1 = new Student(1, "James");
            Student s2 = new Student(2, "Bob");
            Student s3 = new Student(3, "John");

            s1.display();
            s2.display();
            s3.display();
        }
}
