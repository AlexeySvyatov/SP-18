package com.company;
import java.io.*;


public class Main{
    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        try(BufferedReader reader = new BufferedReader(new FileReader("fileСonsistent1.txt"))){
            try(BufferedWriter writer = new BufferedWriter(new FileWriter("fileСonsistent2.txt"))){
                String line;
                while((line = reader.readLine()) != null){
                    writer.write(line + "\n");
                }
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        System.out.println((System.currentTimeMillis() - startTime) + " - время при последовательном копировании");
        Parallel fileActions1 = new Parallel("fileParallel1");
        Parallel fileActions2 = new Parallel("fileParallel2");
        fileActions1.join();
        fileActions2.join();
    }
}
