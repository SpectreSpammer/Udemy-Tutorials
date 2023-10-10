package org.example;

import java.io.FileWriter;
import java.io.IOException;

public class PrintWriter {
    public static void main(String[] args) {

        String TEST_FILE_PATH = "C:\\Users\\ITG01153\\Downloads\\sql query\\TEST.txt";
        try( java.io.PrintWriter bookWriter = new java.io.PrintWriter(new FileWriter(TEST_FILE_PATH))) {
                bookWriter.println("THIS IS UDEMY VIDEO");
                bookWriter.println(199.3);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}