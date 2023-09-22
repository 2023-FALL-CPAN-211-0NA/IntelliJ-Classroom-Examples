package org.humber.dsa.week3;

import java.io.*;

public class BufferedInputOutputStreamsExample {

    public static void main(String[] args) {
        String source = "week3_files/input.dat";
        String destination = "week3_files/output_with_buffering.dat";

        try (InputStream in = new BufferedInputStream(new FileInputStream(source));
             OutputStream out = new BufferedOutputStream(new FileOutputStream(destination))) {

            System.out.println("Started File copy");
            EfficiencyCalculator.startRecording();

            int byteRead;
            while ((byteRead = in.read()) != -1) {
                out.write(byteRead);
            }

            EfficiencyCalculator.stopRecording();
            System.out.println("File Copy Completed");

        } catch (FileNotFoundException e) {
            System.err.println("File is not found:" + e);
        } catch (IOException e) {
            System.err.println("Failed to Read/Write to file: " + e);
        }
    }
}
