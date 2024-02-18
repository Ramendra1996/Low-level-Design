package opps;

public class StudentApp {

    public static void main(String[] args) {
        Student A = new Student(1,13,"ram",3);
        System.out.println(A);

        Student B = new Student(A);
        System.out.println(B);
    }
}
