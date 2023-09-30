package org.humber.dsa.week3;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


interface Employee extends Serializable {

    int getEmployeeId();

    String getName();

    String getDepartment();
}

class HR implements Employee {
    private final int employeeId;
    private final String name;

    HR(int employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getEmployeeId() {
        return employeeId;
    }

    @Override
    public String getDepartment() {
        return "Human Resource";
    }
}

class Developer implements Employee {
    private final int employeeId;
    private final String name;

    Developer(int employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    @Override
    public int getEmployeeId() {
        return employeeId;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDepartment() {
        return "Technology";
    }
}


public class LabWeek3 {

    public static void main(String[] args) {

        String fileName = "Product.ser";

        List<Object> objects = Arrays.asList(
                new Developer(1, "Developer 1"),
                new Developer(2, "Developer 2"),
                new HR(3, "HR Employee 1"),
                new HR(4, "HR Employee 2")
        );

        writeObjectsData(objects, fileName);
        System.out.println("-------------------------------------");

        List<Employee> employees = readEmployeesData(fileName);
        if(!employees.isEmpty()) {
            printEmployees(employees);
        } else {
            System.out.println("Unable to read employees data");
        }
    }

    //PRINTS ALL EMPLOYEES
    private static void printEmployees(List<Employee> employees) {
        employees.stream()
                .map(
                        each -> "Department = "
                                .concat(each.getDepartment())
                                .concat(" | EmployeeId = ")
                                .concat(each.getEmployeeId() + "")
                                .concat(" | Name = ")
                                .concat(each.getName())
                                .concat("------------------------")
                )
                .forEach(System.out::println);
    }

    private static void writeObjectsData(List<Object> objects, String fileName) {
        //TODO: WRITE DATA TO FILE USING OUTSTREAM OF YOUR CHOICE
        //HINT: HR & Developer Classes are Serializable
    }

    private static List<Employee> readEmployeesData(String fileName) {
        List<Employee> employees = new ArrayList<>();
        //TODO: READ THE DATA FROM INPUT STREAM OF YOUR CHOICE
        //STORE THE DATA IN LIST FORMAT OF EMPLOYEES AND RETURN IT.
        return employees;
    }
}
