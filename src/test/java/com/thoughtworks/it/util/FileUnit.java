package com.thoughtworks.it.util;

import sun.nio.cs.UTF_8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileUnit {
    public static String read(String file) throws IOException {
        return new String(readAllBytes(file(fileName).topath()), UTF_8));
    }

    public File file(String fileName) throws FileNotFoundException {
        return getFile("classpath:" + fileName);
    }

    public static List<String> readfileByLines(String fileName) throws FileNotFoundException{
        File file = getFile("classpath:" + fileName);
        List<String> list = new ArrayList<String>();

        BufferedReader reader = null;

        try{
            reader = new BufferedReader(new FileReader(file));
            String lineContent = null;
            int lineNo = 1;
            while((lineContent = reader.readLine()) != null){
                list.add(lineContent);
                lineNo++;
            }
            reader.close();
        }catch (IOException e){
            e.printStackTrace();
        }finally{
            if (reader != null){
                try {
                    reader.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }

        }
    }
}