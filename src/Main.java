import model.Student;
import service.StudentService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        StudentService service = new StudentService();
        Scanner scanner = new Scanner(System.in);
        int index = 0;
        Student[] students = new Student[10];
        boolean isActive = true;

        while (isActive) {
            System.out.println("--------------Menu--------------");
            System.out.println("Enter 1 to create a new Student");
            System.out.println("Enter 2 to print all the students");
            System.out.println("Enter 3 to find the student with the highest mark");
            System.out.println("Enter 4 to find the oldest student");
            System.out.println("Enter 5 for exit");
            int command = scanner.nextInt();
            switch (command) {
                case 1:
                    students[index] = service.createStudent();
                    index++;
                    break;
                case 2:
                    service.printAll(students);
                    break;
                case 3:
                    service.findStudentWithHighestMark(students);
                    break;
                case 4:
                    service.findOldestStudent(students);
                    break;
                case 5:
                    isActive = false;
                    break;
                default:
                    System.out.println("Such command does not exist!");
            }
        }


    }
}