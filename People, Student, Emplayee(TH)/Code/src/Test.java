public class Test {
    public static void main(String[] args) {
        StudentImpl student = new StudentImpl("Hung", 19, true);


        student.eat();
        student.sleep();
        student.registerCourse("Programming Node JS");
        student.attendClass();
    }
}