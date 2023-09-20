package org.humber.dsa.week3;

import java.io.File;
import java.io.IOException;

public class CreateFileExample {

    public static void main(String[] args) {
        try {
            File file = new File("NewFile.txt");

            System.out.println("Is file exists: " + file.exists());
            boolean isFileCreated = file.createNewFile();

            System.out.print("Is File created: ");
            if (isFileCreated) {
                System.out.println("Success");
            } else {
                System.out.println("Failed");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
