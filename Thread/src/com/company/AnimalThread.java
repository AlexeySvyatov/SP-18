package com.company;

public class AnimalThread extends Thread{
    String animal;
    int priority;
    AnimalThread(String name, int priority){
        Thread animal = new Thread(this.animal = name);
        animal.setPriority(this.priority = priority);
    }
    @Override
    public void run(){
        int i;
        for (i = 1; i <= 10; i++){
            try{
                Thread.sleep((long)(Math.random() * 500));
                System.out.println(animal + " пробежал " + i + " м. ");

            }catch (InterruptedException ex){
                ex.printStackTrace();
            }
        }
        System.out.println(animal + " финишировал.");
        System.out.println("Поток " + animal + " завершен.");
    }
}

class RabbitAndTurtle{
    public static void main(String[] args){
        AnimalThread rabbit = new AnimalThread("Заяц", 1);
        AnimalThread turtle = new AnimalThread("Черепаха", 3);
        rabbit.start();
        turtle.start();
    }
}