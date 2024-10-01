package com.practice.files;

import java.io.*;
import java.nio.file.Files;
import java.util.Scanner;
import java.util.logging.Logger;

public class FileOperations {
    static File file = new File("test.txt");
    static Logger logger = Logger.getLogger("FileOperations");
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        logger.info("createFile method is called");
        if(createFile()){
            logger.info("File Created ");
        }else{
            logger.info("File Already Created");
        }
        scanner.next();
        writeFile("Hello!, This is a test.");
        scanner.next();
        readFile();
        scanner.next();
        updateFile("Added this line");
        scanner.next();
        deleteFile();
    }

    public static boolean createFile() throws IOException {
        return file.createNewFile();
    }

    public static void readFile() throws IOException {
        if(file.canRead()){
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){
                String lineRead;
                while ((lineRead=bufferedReader.readLine())!=null){
                    logger.info(lineRead);
                }
            }

        }
    }

    public static void writeFile(String string) throws IOException {
        if(file.canWrite()){
           try( BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
               bufferedWriter.write(string);
               logger.info("Write Successful!!");
           }
        }
    }

    public static void deleteFile() throws IOException {
         Files.delete(file.toPath());
         logger.info("Delete Successful!!");
    }

    public static void updateFile(String string) throws IOException {
        if(file.canWrite()){
            try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file,true))){
                 bufferedWriter.append(string);
                 logger.info("Update Successfully!!");
            }
        }
    }
}
