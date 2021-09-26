package com.company;
import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Первое число - ");
        int numb1 = scanner.nextInt();
        System.out.print("Второе число - ");
        int numb2 = scanner.nextInt();
        int numb3 = (int)Math.pow(10, (Math.log10(numb1) + Math.log10(numb2)));
        System.out.print("Произведение - " + numb3);
    }
}
