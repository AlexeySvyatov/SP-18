package com.company;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Parallel extends Thread{
    String fileName;
    Path path;
    Parallel(String fileName, Path path){
        this.fileName = fileName;
        this.path = path;
        this.start();
    }
    @Override
    public void run(){
        long startTime = System.currentTimeMillis();
        try{
            Files.copy(path, Paths.get(fileName), StandardCopyOption.REPLACE_EXISTING);
        }catch(Exception ex){
            ex.printStackTrace();
        }
        System.out.println((System.currentTimeMillis() - startTime) + " - время при параллельном копировании");
    }
}
