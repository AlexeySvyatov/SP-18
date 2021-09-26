package com.company;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("multiplication.txt"))){
            String readed = reader.readLine();
            String[] txtNumb = readed.split("\\W");
            FileNumbs somethng = new FileNumbs(Integer.parseInt(txtNumb[0]), Integer.parseInt(txtNumb[1]));
            somethng.Multiplication();
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
    }
    public static class FileNumbs{
        int numb1;
        int numb2;
        FileNumbs(int numb1, int numb2){
            this.numb1 = numb1;
            this.numb2 = numb2;
        }
        public void Multiplication(){
            System.out.println("Произвдение равно " + (int)Math.pow(10, (Math.log10(numb1) + Math.log10(numb2))));
        }
    }
}
