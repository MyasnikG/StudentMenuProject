package model;

public class Student {

    private String name;
    private String surname;
    private int age;
    private char gender;
    private double mark;
    private boolean isPhD;


    public Student(String name, String surname, int age, char gender, double mark, boolean isPhD) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
        this.mark = mark;
        this.isPhD = isPhD;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public void setPhD(boolean phD) {
        isPhD = phD;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public double getMark() {
        return mark;
    }

    public boolean isPhD() {
        return isPhD;
    }

    public void print(){
        System.out.println("Student name: " + name);
        System.out.println("Student surname: " + surname);
        System.out.println("Student age: " + age);
        System.out.println("Student gender: " + (gender=='f'||gender=='F'?"Female":"Male"));
        System.out.println("Student mark: " + mark);
        System.out.println("Does the student has a PhD degree? " + (isPhD?"Yes":"No"));
    }
}
