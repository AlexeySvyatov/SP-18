package com.company;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

public class DownloadStream implements Runnable{
    //Ссылка на объект потока
    Thread thread;
    //Создание переменных
    String strUrl;
    String path;

    public DownloadStream(String strUrl, String path){
        this.strUrl = strUrl;
        this.path = path;
        // Создание объекта потока
        thread = new Thread(this);
        System.out.println(thread);
        // Запуск потока
        thread.start();
    }
    @Override
    public void run(){
        try {
            URL url = new URL(strUrl);
            ReadableByteChannel byteChannel = Channels.newChannel(url.openStream());
            FileOutputStream stream = new FileOutputStream(path);
            stream.getChannel().transferFrom(byteChannel, 0, Long.MAX_VALUE);
            stream.close();
            byteChannel.close();

        }catch (IOException ex){
            ex.printStackTrace();
        }
        System.out.println("Скачивание завершено");
    }
    public void start(){}
}
