package com.company;

public class StudentOutputToConsolePrinter implements IStudentPrinter {
    private IStudentStringConverter student;

    @Override
    public void print(Student student) {
        System.out.println(student.toString());
    }
}
