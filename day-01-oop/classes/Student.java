public class Student {

    private String studentId;
    private Person person;

    public Student(String studentId, Person person) {
        this.studentId = studentId;
        this.person = person;
    }

    public void displayStudentInfo() {
        person.introduce();
        System.out.println("Student ID: " + studentId);
    }
}
