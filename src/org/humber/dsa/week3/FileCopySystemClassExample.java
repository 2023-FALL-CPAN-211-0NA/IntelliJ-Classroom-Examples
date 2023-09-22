package org.humber.dsa.week3;

import java.io.*;
import java.util.Scanner;

public class FileCopySystemClassExample {


    public static void main(String[] args) {

        String source = "week3_files/input.txt";
        String destination = "week3_files/SystemOutput.txt";

        try (InputStream in = new BufferedInputStream(new FileInputStream(source));
             OutputStream out = new BufferedOutputStream(new FileOutputStream(destination))) {

            System.setIn(in);

            PrintStream outCopy = System.out;

            System.setOut(new PrintStream(out));

            EfficiencyCalculator.startRecording();

            Scanner scanner = new Scanner(System.in);
            while(scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }

            System.setOut(outCopy);

            EfficiencyCalculator.stopRecording();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
