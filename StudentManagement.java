import java.util.Scanner;

class StudentManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;
        String studentName = "";
        int studentAge = 0;
        double studentMarks = 0;

        do {
            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Student Details");
            System.out.println("3. Update Marks");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter Student Name: ");
                    studentName = sc.nextLine();

                    System.out.print("Enter Student Age: ");
                    studentAge = sc.nextInt();

                    System.out.print("Enter Student Marks: ");
                    studentMarks = sc.nextDouble();

                    System.out.println("Student added successfully!");
                    break;

                case 2:
                    if (studentName.isEmpty()) {
                        System.out.println("No student record found.");
                    } else {
                        System.out.println("\nStudent Details");
                        System.out.println("Name  : " + studentName);
                        System.out.println("Age   : " + studentAge);
                        System.out.println("Marks : " + studentMarks);

                        if (studentMarks >= 50) {
                            System.out.println("Result: Pass");
                        } else {
                            System.out.println("Result: Fail");
                        }
                    }
                    break;

                case 3:
                    if (studentName.isEmpty()) {
                        System.out.println("No student record found.");
                    } else {
                        System.out.print("Enter New Marks: ");
                        studentMarks = sc.nextDouble();
                        System.out.println("Marks updated successfully!");
                    }
                    break;

                case 4:
                    System.out.println("Exiting Program...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}