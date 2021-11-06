package com.company;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Main{
    public static void main(String[] args) throws InterruptedException, IOException{
        long startTime = System.currentTimeMillis();
        Path readedFile = Paths.get("fileСonsistent1.txt");
        Path writedFile = Paths.get("fileСonsistent2.txt");
        Files.copy(readedFile, writedFile, StandardCopyOption.REPLACE_EXISTING);
        System.out.println((System.currentTimeMillis() - startTime) + " - время при последовательном копировании");
        Parallel fileActions1 = new Parallel("fileParallel1.txt", readedFile);
        Parallel fileActions2 = new Parallel("fileParallel2.txt", readedFile);
        fileActions1.join();
        fileActions2.join();
    }
}
