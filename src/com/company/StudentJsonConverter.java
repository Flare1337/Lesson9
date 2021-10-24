package com.company;

public class StudentJsonConverter implements IStudentStringConverter {
    @Override
    public String convert(Student student) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{\n");
        stringBuilder.append("\"name\":").append("\"" + student.getName()).append(",\n");
        stringBuilder.append("\"age\":").append(student.getAge()).append(",\n");
        stringBuilder.append("\"salary\":").append(student.getSalary());
        stringBuilder.append("\n}");
        return stringBuilder.toString();
    }
}
