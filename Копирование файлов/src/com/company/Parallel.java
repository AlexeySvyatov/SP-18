package com.company;
import java.io.*;

public class Parallel extends Thread{
    String fileName;
    Parallel(String  fileName){
        this.fileName = fileName;
        this.start();
    }
    @Override
    public void run(){
        long startTime = System.currentTimeMillis();
        try(BufferedReader reader = new BufferedReader(new FileReader("fileСonsistent1.txt"))){
            try(BufferedWriter writer = new BufferedWriter(new FileWriter(this.fileName + ".txt"))){
                String line;
                while((line = reader.readLine()) != null){
                    writer.write(line + "\n");
                }
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        System.out.println((System.currentTimeMillis() - startTime) + " - время при параллельном копировании");
    }
}
