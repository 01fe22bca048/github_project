import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Period;

public class Student {
    private String name;
    private LocalDate dob;

    public Student(String name, LocalDate dob) {
        this.name = name;
        this.dob = dob;
    }

    public int calculateAge() {
        LocalDate currentDate = LocalDate.now();
        return Period.between(dob, currentDate).getYears();
    }

    public void displayInfo() {
        int age = calculateAge();
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Example usage
        String name = "John Doe";
        String dobString = "2000-05-14"; // Example date of birth in YYYY-MM-DD format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate dob = LocalDate.parse(dobString, formatter);
        
        Student student = new Student(name, dob);
        student.displayInfo();
    }
}
