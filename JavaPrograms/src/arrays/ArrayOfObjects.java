package arrays;

// Step 1: Define the Class
class Student {
    int rollNo;
    String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    void display() {
        System.out.println("roll No: " + rollNo + ", Name: " + name);
    }
}

public class ArrayOfObjects {
    public static void main(String[] args) {
        // Step 2: Instantiate the Array (Size of 3)
        Student[] classroom = new Student[3];
        // At this point, classroom[0], [1], and [2] are all NULL.

        // Step 3: Instantiate each Student object
        classroom[0] = new Student(101, "Sankar");
        classroom[1] = new Student(102, "White");
        classroom[2] = new Student(103, "Devil");

        // Accessing and using the objects
        System.out.println("Student Records: ");
        // for (int i = 0; i < classroom.length; i++) {
        //    classroom[i].display();
        // }
        for (Student student : classroom) {
            student.display();
        }
    }
}
