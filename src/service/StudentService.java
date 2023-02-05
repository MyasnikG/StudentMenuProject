package service;

import model.Student;

import java.util.Scanner;

public class StudentService {

    public Student createStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student's name");
        String name = scanner.next();
        System.out.println("Enter student's surname");
        String surname = scanner.next();
        System.out.println("Enter student's age");
        int age = scanner.nextInt();
        System.out.println("Enter student's gender");
        String g = scanner.next();
        char gender = g.charAt(0);
        System.out.println("Enter student's mark");
        double mark = scanner.nextDouble();
        System.out.println("Does the student have a PhD degree?");
        boolean isPhD = scanner.nextBoolean();


        return new Student(name, surname, age, gender, mark, isPhD);
    }


    public void printAll(Student[] students) {
        for (Student x : students) {
            if (x != null) {
                x.print();
                System.out.println();
            }
        }
    }


    public void findStudentWithHighestMark(Student[] students) {
        Student max = students[0];
        int index = 0;
        for (int i = 1; i < students.length; i++) {
            if (students[i] != null && students[i].getMark() > max.getMark()) {
                max = students[i];
                index = i;
            }
        }

        if (max != null) {
            max.print();
        }

        for (int i = index+1; i < students.length; i++) {
            if ((students[i] != null && max!= null) && students[i].getMark() == max.getMark()) {
                students[i].print();
                System.out.println();
            }
        }

    }


    public void findOldestStudent(Student[] students) {
        Student oldest = students[0];
        int index = 0;

        for (int i = 1; i < students.length; i++) {
            if (students[i] != null && students[i].getAge() > oldest.getAge()) {
                oldest = students[i];
                index = i;
            }
        }

        if (oldest != null) {
            oldest.print();
            System.out.println();
        }

        for (int i = index+1; i < students.length; i++) {
            if ((students[i] != null && oldest!= null) && students[i].getAge() == oldest.getAge()) {
                students[i].print();
                System.out.println();
            }
        }
    }

}
