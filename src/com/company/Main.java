package com.company;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        // write your code here

        IStudentStringConverter iStudentStringConverter = new Main().randomConverter();
        System.out.println(iStudentStringConverter.convert(new Student("Mary", 21 , new BigDecimal("3.14"))));
    }
    private void processTheTaskData() {
        IStudentPrinter[] printers = new IStudentPrinter[] {
                new StudentToStringPrinter(),
                new StudentOutputToConsolePrinter(),
                new StudentToStringPrinter(),
                new StudentOutputToConsolePrinter(),
                new StudentToStringPrinter()
        };

        // Логихкая ошибка, нужно либо уже до напихать в объекты либо уже после но чтобы те норм их обрабатывали
        Student student = new Student("Josh",12, new BigDecimal("23.5"));

        IStudentPrinter studentStringConverter = new DelegatingStudentPrinter(printers);
        studentStringConverter.print(student);
    }

    private IStudentStringConverter randomConverter() {
        double random = Math.random();
        if (random > 0.7) {
            return new StudentJsonConverter();
        }
        else if (random > 0.4) {
            return new StudentXmlConverter();
        }
        else {
            return new StudentKeyValueConverter();
        }
    }
}
