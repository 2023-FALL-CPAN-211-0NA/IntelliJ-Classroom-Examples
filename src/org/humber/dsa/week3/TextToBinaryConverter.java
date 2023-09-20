package org.humber.dsa.week3;

import java.io.*;

public class TextToBinaryConverter {
    public static void main(String[] args) {
        String sourceTextFilePath = "week3_files/input.txt"; // Replace with your source text file
        String destinationBinaryFilePath = "week3_files/input.dat"; // Replace with your destination binary file

        try (BufferedReader reader = new BufferedReader(new FileReader(sourceTextFilePath));
             DataOutputStream binaryOutputStream = new DataOutputStream(new FileOutputStream(destinationBinaryFilePath))) {

            EfficiencyCalculator.startRecording();

            String line;
            while ((line = reader.readLine()) != null) {
                // Write each line as binary data
                byte[] lineBytes = line.getBytes();
                binaryOutputStream.writeInt(lineBytes.length); // Write the length of the line
                binaryOutputStream.write(lineBytes); // Write the line as binary data
            }

            EfficiencyCalculator.stopRecording();

            System.out.println("Text to binary conversion completed successfully.");
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Error converting the file: " + e.getMessage());
        }
    }
}
