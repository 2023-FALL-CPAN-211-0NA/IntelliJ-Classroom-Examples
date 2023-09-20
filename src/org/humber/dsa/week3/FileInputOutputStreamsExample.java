package org.humber.dsa.week3;

import java.io.*;

public class FileInputOutputStreamsExample {

    public static void main(String[] args) {
        String source = "week3_files/input.dat";
        String destination = "week3_files/output_without_buffering.dat";

        try {
            InputStream in = new FileInputStream(source);
            OutputStream out = new FileOutputStream(destination);

            System.out.println("Started File copy");
            EfficiencyCalculator.startRecording();

            int byteRead;
            while ((byteRead = in.read()) != -1) {
                out.write(byteRead);
            }

            EfficiencyCalculator.stopRecording();
            System.out.println("File Copy Completed");

            in.close();
            out.close();

        } catch (FileNotFoundException e) {
            System.err.println("File is not found:" + e);
        } catch (IOException e) {
            System.err.println("Failed to Read/Write to file: " + e);
        }
    }
}
