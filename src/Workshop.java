
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Workshop {
    private String name;
    private int capacity;
    private int minimumScore;
    private List<Student> students;

    public Workshop(String name, int capacity, int minimumScore) {
        this.name = name;
        this.capacity = capacity;
        this.minimumScore = minimumScore;
        this.students = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getMinimumScore() {
        return minimumScore;
    }

    public void setMinimumScore(int minimumScore) {
        this.minimumScore = minimumScore;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void registerStudent(Student student) {

        if (!students.contains(student)) {
            student.setStatus(Status.REGISTERED);
            students.add(student);
        }
    }

    public void displayWorkshopInfo() {

        System.out.println("Workshop: " + name);
        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println();
    }

    public void assignRandomScore() {
        for (Student student : students) {
            int score = (int) (Math.random() * 21);
            student.setScore(score);
        }
    }

    public void sortStudents() {
        students.sort(Comparator.comparing(Student::getScore).reversed().thenComparing(Student::getId));
    }

    public void assignVacancies() {
        int admitted = 0;

        for (Student student: students) {

            if (student.getScore() < minimumScore) {
                student.setStatus(Status.REJECTED);
                continue;
            }

            if (admitted < capacity) {
                student.setStatus(Status.ADMITTED);
                admitted++;
                continue;
            }

            student.setStatus(Status.WAITLISTED);


        }
    }

}
