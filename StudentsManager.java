class StudentsManager {
    private StudentStack studentStack;

    public StudentsManager(int stackSize) {
        studentStack = new StudentStack(stackSize);
    }

    // Add a student
    public void addStudent(Student student) {
        studentStack.push(student);
    }

    // Delete the last added student
    public void deleteStudent() {
        studentStack.pop();
    }

    // Search for a student by ID
    public void searchStudent(int id) {
        boolean found = false;
        for (int i = 0; i <= studentStack.top; i++) {
            if (studentStack.stackArray[i].id == id) {
                System.out.println("Student found:  " + studentStack.stackArray[i]);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student not found.");
        }
    }

    // Sort students by grade (simple bubble sort)
    public void sortStudentsByGrade() {
        for (int i = 0; i <= studentStack.top; i++) {
            for (int j = 0; j < studentStack.top - i; j++) {
                if (studentStack.stackArray[j].grade > studentStack.stackArray[j + 1].grade) {
                    Student temp = studentStack.stackArray[j];
                    studentStack.stackArray[j] = studentStack.stackArray[j + 1];
                    studentStack.stackArray[j + 1] = temp;
                }
            }
        }
        System.out.println("Students sorted by grade.");
        studentStack.look();  // Display the sorted students
    }

    // Display all students
    public void displayStudents() {
        studentStack.look();
    }
}
