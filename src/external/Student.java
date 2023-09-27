package external;

import java.io.Serializable;

/**
 * When we import libraries (JAR files), All the classes (.class files)
 * gets copied to the root of the source location of
 * existing project files during the compilation of programs.
 * */
public class Student implements Comparable<Student>, Serializable {

    private final String name;
    private final double percentage;

    public Student(String name, double percentage) {
        this.name = name;
        this.percentage = percentage;
    }

    public String getName() {
        return name;
    }

    public double getPercentage() {
        return percentage;
    }

    @Override
    public int compareTo(Student that) {
        if(this.percentage > that.percentage) {
            return 1;
        }
        if(this.percentage == that.percentage) {
            return 0;
        }
        //when this.percentage < that.percentage
        return -1;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", percentage=" + percentage +
                '}';
    }
}
