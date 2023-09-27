package org.humber.dsa.week3;

import external.Student;

import java.io.*;


public class ObjectStreamExample {
    public static void main(String[] args) {

        String fileName = "week3_files/Product.ser";

        // Serialize the Product object to a file
        writeData(fileName);

        // Deserialize the Product object from the file
        readData(fileName);
    }

    private static void writeData(String fileName) {
        Product product = new Product("KeyBoard", 30.2);
        Student student = new Student("Jack", 90);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(product);
            oos.writeObject(student);
            System.out.println("Product object serialized and saved to " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readData(String fileName) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            Student student = (Student) ois.readObject();
            Product deserializedProduct = (Product) ois.readObject();
            System.out.println("Deserialized Product object: " + deserializedProduct);
            System.out.println("Student: " + student);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
