package org.humber.dsa.week3;

import java.io.*;

public class ImprovedFileInputOutputStreamsExample {

    public static void main(String[] args) {
        String source = "week3_files/input.dat";
        String destination = "week3_files/output_without_buffering_improved.dat";

        try {
            InputStream in = new FileInputStream(source);
            OutputStream out = new FileOutputStream(destination);

            System.out.println("Started File copy");
            EfficiencyCalculator.startRecording();

            //Create a byte array to hold the data read from the source file
            byte[] buffer = new byte[2];
            int bytesRead;

            while ((bytesRead = in.read(buffer)) != -1) {
                out.write(bytesRead);
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
