import java.util.Scanner;

class Student {
    String name;
    int rollNumber;
    int mark1, mark2, mark3;
    int total;
    float average;
    char grade;

    void inputDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        rollNumber = sc.nextInt();

        System.out.print("Enter Mark 1: ");
        mark1 = sc.nextInt();

        System.out.print("Enter Mark 2: ");
        mark2 = sc.nextInt();

        System.out.print("Enter Mark 3: ");
        mark3 = sc.nextInt();
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
        System.out.println("\n===== Student Result =====");
        System.out.println("Student Name : " + name);
        System.out.println("Roll Number  : " + rollNumber);
        System.out.println("Marks        : " + mark1 + ", " + mark2 + ", " + mark3);
        System.out.println("Total Marks  : " + total);
        System.out.println("Average      : " + average);
        System.out.println("Grade        : " + grade);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.inputDetails();     // user enters data
        s1.calculateTotal();   // calculate result
        s1.displayResult();    // display result
    }
}
