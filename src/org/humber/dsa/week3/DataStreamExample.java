package org.humber.dsa.week3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamExample {

    public static void main(String[] args) {

        String fileName = "week3_files/data.dat";

        // Writing data to a file using DataOutputStream
        writeData(fileName);
        System.out.println("------------------------------------");
        // Reading data from a file using DataInputStream
        readData(fileName);
    }

    private static void writeData(String fileName) {

        System.out.println("Writing Data to File");
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))) {
            // Write various types of data
            dos.writeInt(42);
            dos.writeDouble(3.14159);
            dos.writeUTF("Hello, World!");
            dos.writeBoolean(true);
        } catch (IOException e) {
            System.err.println("Error writing to the file: " + e.getMessage());
        }
    }

    private static void readData(String fileName) {

        System.out.println("Reading Data from the File");
        try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {
            // Read the data in the same order it was written
            int intValue = dis.readInt();
            double doubleValue = dis.readDouble();
            String stringValue = dis.readUTF();
            boolean booleanValue = dis.readBoolean();

            // Display the read values
            System.out.println("Int Value: " + intValue);
            System.out.println("Double Value: " + doubleValue);
            System.out.println("String Value: " + stringValue);
            System.out.println("Boolean Value: " + booleanValue);
        } catch (IOException e) {
            System.err.println("Error reading from the file: " + e.getMessage());
        }
    }

}
