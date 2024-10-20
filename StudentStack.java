class StudentStack {
    public Student[] stackArray;
    public int top;
    private int maxSize;

    public StudentStack(int size) {
        this.maxSize = size;
        this.stackArray = new Student[size];
        this.top = -1;  // Initial state,  stack is empty
    }

    // Push a student onto the stack
    public void push(Student student) {
        if (top == maxSize - 1) {
            System.out.println("Stack is full. Cannot push.");
        } else {
            stackArray[++top] = student;
        }
    }

    // Pop a student from the stack
    public Student pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return null;
        } else {
            return stackArray[top--];
        }
    }

    // Peek at the top of the stack without popping
    public Student top() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot look at top.");
            return null;
        } else {
            return stackArray[top];
        }
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Look at all elements without popping
    public void look() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Students in stack: ");
            for (int i = 0; i <= top; i++) {
                System.out.println(stackArray[i]);
            }
        }
    }
}
