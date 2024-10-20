public class Main {
    public static void main(String[] args) {
        StudentsManager manager = new StudentsManager(5);  // Stack size 5

        // Adding students
        manager.addStudent(new Student(1,  "Nghia",  85.5));
        manager.addStudent(new Student(2,  "thiep",  90.0));
        manager.addStudent(new Student(3,  "tuan anh",  78.2));

        // Display all students
        manager.displayStudents();

        // Search for a student
        manager.searchStudent(1);

        // Sort students by grade
        manager.sortStudentsByGrade();

        // Delete a student
        manager.deleteStudent( );

        // Display all students after deletion
        manager.displayStudents();
    }
}