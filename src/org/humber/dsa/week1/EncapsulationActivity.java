package org.humber.dsa.week1;

/**
 * ENCAPSULATION - Activity
 * */
class Student {

    private final int id;
    private String name;
    private String course;

    public Student(int id) {
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}


public class EncapsulationActivity {

    public static void main(String[] args) {

        Student jack = new Student(1000);
        jack.setName("Jack");
        jack.setCourse("Data Structures");

        System.out.println("Student Id: " + jack.getId());
        System.out.println("Student Name: " + jack.getName());
        System.out.println("Course: " + jack.getCourse());
    }
}

