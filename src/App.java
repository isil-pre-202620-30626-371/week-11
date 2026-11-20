public class App {
    public static void main(String[] args) throws Exception {

        Student student1 = new Student(1, "John Doe");
        Student student2 = new Student(2, "Jane Smith");
        Student student3 = new Student(3, "Michael Johnson");
        Student student4 = new Student(4, "Emily Davis");
        Student student5 = new Student(5, "David Wilson");
        Student student6 = new Student(6, "Sarah Brown");
        Student student7 = new Student(7, "James Martinez");
        Student student8 = new Student(8, "Lisa Anderson");
        Student student9 = new Student(9, "Robert Taylor");
        Student student10 = new Student(10, "Jennifer White");

        Workshop workshop = new Workshop("Java Programming", 15, 60);
        workshop.registerStudent(student1);
        workshop.registerStudent(student2);
        workshop.registerStudent(student3);
        workshop.registerStudent(student4);
        workshop.registerStudent(student5);
        workshop.registerStudent(student6);
        workshop.registerStudent(student7);
        workshop.registerStudent(student8);
        workshop.registerStudent(student9);
        workshop.registerStudent(student10);

    }
}

