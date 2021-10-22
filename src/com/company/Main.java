package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        new Main().run();
    }

    private void run() {
        IStudentStringConverter jsonConverter = new StudentJsonConverter();
        IStudentStringConverter xmlConverter = new StudentXmlConverter();
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
