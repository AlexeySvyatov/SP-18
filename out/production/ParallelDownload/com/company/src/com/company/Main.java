package com.company;

import java.io.*;
import java.util.Scanner;

public class Main{
    private static final String IN_FILE_TXT = "D:\\PictureIMusic\\inFile.txt";

    public static void main(String[] args){
        String url;
        String[] array = new String[2];
        try (BufferedReader inFile = new BufferedReader(new FileReader(IN_FILE_TXT))) {
            while ((url = inFile.readLine()) != null) {
                array = url.split(" ");
                DownloadStream downloadStream = new DownloadStream(array[0], array[1]);
                downloadStream.start();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Послушать музыку? Если да то введите Y, иначе - N");
        Scanner scan = new Scanner(System.in);
        String p = scan.nextLine();
        MP3Player player = new MP3Player();
        if (p.equals("Y")) {
            player.playback(array[1]);
        }else{
            System.out.println("Досвидания!");
        }
    }
}
