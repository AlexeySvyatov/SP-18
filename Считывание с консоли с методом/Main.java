package com.company;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите выражение: ");
        String inputed = in.nextLine();
        String[] conNumb = inputed.split("\\W");
        Multiplication(Integer.parseInt(conNumb[0]), Integer.parseInt(conNumb[1]));
    }
    public static void Multiplication(int numb1, int numb2){
        System.out.println("Произвдение равно " + (int)Math.pow(10, (Math.log10(numb1) + Math.log10(numb2))));
    }
}
