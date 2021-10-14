package com.company;

public class AnimalThread extends Thread{
    String animalName;
    int priority;
    AnimalThread(String name, int priority){
        Thread animal = new Thread(this.animalName = name);
        animal.setPriority(this.priority = priority);
    }

    @Override
    public void run(){
        int i;
        for (i = 1; i <= 10; i++){
            try{
                Thread.sleep((long)(Math.random() * 500));
                System.out.println(animalName + " пробежал " + i + " м. ");

            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        System.out.println(animalName + " финишировал");
    }
}

class RabbitAndTurtle {
    public static void main(String[] args) {
        AnimalThread rabbit = new AnimalThread("Заяц", 1);
        AnimalThread turtle = new AnimalThread("Черепаха", 3);
        rabbit.start();
        turtle.start();
    }

}