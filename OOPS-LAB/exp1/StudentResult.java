class Student {
    String name;
    int rollNumber;
    int mark1, mark2, mark3;
    int total;
    float average;
    char grade;
    void inputDetails(String studentName, int roll, int m1, int m2, int m3) {
        name = studentName;
        rollNumber = roll;
        mark1 = m1;
        mark2 = m2;
        mark3 = m3;
    }
    void calculateTotal() {
        total = mark1 + mark2 + mark3;
        average = total / 3.0f;
        if (average >= 90)
            grade = 'A';
        else if (average >= 75)
            grade = 'B';
        else if (average >= 60)
            grade = 'C';
        else if (average >= 40)
            grade = 'D';
        else
            grade = 'F';
    }
    void displayResult() {
        System.out.println("Student Name : " + name);
        System.out.println("Roll Number  : " + rollNumber);
        System.out.println("Marks        : " + mark1 + ", " + mark2 + ", " + mark3);
        System.out.println("Total Marks  : " + total);
        System.out.println("Average      : " + average);
        System.out.println("Grade        : " + grade);
    }
}


public class StudentResult {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.inputDetails("Anish Karthic", 110, 85, 98, 92);
        s1.calculateTotal();
        s1.displayResult();
    }
}
