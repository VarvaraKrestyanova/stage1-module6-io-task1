package com.epam.mjc.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;


public class FileReader {

    public Profile getDataFromFile(File file) {

        String name = null; Integer age = null; String email = null; Long phone = null;
        try(BufferedReader reader = new BufferedReader(new java.io.FileReader(file))) {
            String[] arrLineData = new String[2];
            String line;
            while ((line = reader.readLine()) != null) {
                arrLineData = line.split(": ");
                switch (arrLineData[0]) {
                    case "Name": {name = arrLineData[1]; break;}
                    case "Age": {age = Integer.valueOf(arrLineData[1]); break;}
                    case "Email": {email = arrLineData[1];  break;}
                    case "Phone": {phone = Long.valueOf(arrLineData[1]); break;}
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException("The provided file is not found: " + file.getAbsolutePath(), e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return new Profile(name, age, email, phone);
    }

}
