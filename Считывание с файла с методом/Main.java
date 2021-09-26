package com.company;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args){
        try(BufferedReader reader = new BufferedReader(new FileReader("multiplication.txt"))){
            String readed = reader.readLine();
            String[] txtNumb = readed.split("\\W");
            Multiplication(Integer.parseInt(txtNumb[0]), Integer.parseInt(txtNumb[1]));
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
    public static void Multiplication(int numb1, int numb2){
        System.out.println("Произвдение равно " + (int)Math.pow(10, (Math.log10(numb1) + Math.log10(numb2))));
    }
}
