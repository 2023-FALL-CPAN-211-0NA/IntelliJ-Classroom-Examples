package org.humber.dsa.week2;


import external.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentComparableExample {


    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ajay", 98));
        students.add(new Student("Matt", 67));
        students.add(new Student("Anthony", 78));

        System.out.println("Before Sorting");
        printStudentDetails(students);

        Collections.sort(students);
        System.out.println("After Sorting");
        printStudentDetails(students);
    }

    private static void printStudentDetails(List<Student> students) {
        for(Student each : students) {
            System.out.println("Name: " + each.getName() + " | Percentage: " + each.getPercentage() + " %");
        }
        System.out.println();
    }
}
