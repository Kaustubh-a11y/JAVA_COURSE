// Base Class
class Person {
    protected String name;
    protected int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display Person details
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years");
    }
}

// Derived Class - Student (inherits from Person)
class Student extends Person {
    protected String rollNumber;
    protected double marks;

    // Constructor
    public Student(String name, int age, String rollNumber, double marks) {
        super(name, age);           // Calling parent class constructor
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Overriding displayInfo to include Student-specific details
    @Override
    public void displayInfo() {
        super.displayInfo();        // Display Person details
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
    }
}

// Further Derived Class - GraduateStudent (inherits from Student)
class GraduateStudent extends Student {
    private String specialization;

    // Constructor
    public GraduateStudent(String name, int age, String rollNumber, 
                          double marks, String specialization) {
        super(name, age, rollNumber, marks);   // Calling Student constructor
        this.specialization = specialization;
    }

    // Overriding displayInfo to include GraduateStudent-specific details
    @Override
    public void displayInfo() {
        super.displayInfo();        // Display Student + Person details
        System.out.println("Specialization: " + specialization);
        System.out.println("----------------------------------------");
    }
}

// Main Class to test the program
public class StudentManagementSystem {
    public static void main(String[] args) {
        
        System.out.println("=== STUDENT MANAGEMENT SYSTEM ===\n");

        // Creating objects of different types
        Person person = new Person("Rahul Sharma", 20);
        Student student = new Student("Priya Patel", 21, "S101", 85.5);
        GraduateStudent gradStudent1 = new GraduateStudent("Aarav Singh", 24, 
                                        "GS205", 92.3, "Computer Science");
        GraduateStudent gradStudent2 = new GraduateStudent("Neha Gupta", 23, 
                                        "GS301", 88.7, "Data Science");

        // Displaying information using polymorphism
        System.out.println("1. General Person:");
        person.displayInfo();
        System.out.println("----------------------------------------");

        System.out.println("2. Regular Student:");
        student.displayInfo();
        System.out.println("----------------------------------------");

        System.out.println("3. Graduate Student 1:");
        gradStudent1.displayInfo();

        System.out.println("4. Graduate Student 2:");
        gradStudent2.displayInfo();

        // Demonstrating polymorphism with array
        System.out.println("=== POLYMORPHISM DEMONSTRATION ===");
        Person[] students = new Person[3];
        students[0] = new Student("Rohan Kumar", 22, "S202", 78.9);
        students[1] = new GraduateStudent("Meera Sharma", 25, "GS401", 95.2, "Artificial Intelligence");
        students[2] = new GraduateStudent("Vikram Rao", 24, "GS105", 89.1, "Machine Learning");

        for (Person s : students) {
            s.displayInfo();
        }
    }
}
