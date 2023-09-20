package org.humber.dsa.week3;

import java.io.File;

public class CreateDirectoryExample {

    public static void main(String[] args) {
        //Example 1
        createSimpleDirectory();

        //Example 2
        createDirectories();
    }

    /**
     * Example of "mkdir()"
     * */
    private static void createSimpleDirectory() {
        File file = new File("NewDir");

        System.out.println("Is Directory exists: " + file.exists());
        boolean isDirectoryCreated = file.mkdir();

        System.out.print("Is Directory created: ");
        if (isDirectoryCreated) {
            System.out.println("Success");
        } else {
            System.out.println("Failed");
        }
    }

    /**
     * Example of "mkdirs()"
     *
     * Creates Parent directory if it doesn't exist
     */
    private static void createDirectories() {
        File file = new File("ParentDir/ChildDir");

        System.out.println("Is directory exists: " + file.exists());
        boolean isDirectoryCreated = file.mkdirs();

        System.out.print("Is directory created: ");
        if (isDirectoryCreated) {
            System.out.println("Success");
        } else {
            System.out.println("Failed");
        }
    }
}
