package com.epam.mjc.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;


public class FileReader {

    public Profile getDataFromFile(File file) {
        String profileData = "";
        try(java.io.FileReader reader = new java.io.FileReader(file)) {
            int character;
            while ((character = reader.read()) != -1) {
                profileData += (char) character;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String name; Integer age; String email; Long phone;


        return new Profile();
    }

    public static void main(String[] args) {
        FileReader fileReader = new FileReader();
        File file = new File("src/main/resources/Profile.txt");
        fileReader.getDataFromFile(file);
    }
}
