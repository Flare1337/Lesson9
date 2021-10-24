package com.company;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        // write your code here

        IStudentStringConverter iStudentStringConverter = new Main().randomConverter();
        System.out.println(iStudentStringConverter.convert(new Student("Mary", 21 , new BigDecimal("3.14"))));
    }

    private IStudentStringConverter randomConverter() {
        double random = Math.random();
        if (random > 0.66) {
            return new StudentJsonConverter();
        }
        else if (random > 0.33) {
            return new StudentXmlConverter();
        }
        else {
            return new StudentKeyValueConverter();
        }
    }
}
