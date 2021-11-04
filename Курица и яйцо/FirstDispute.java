package com.company;

public class FirstDispute extends Thread{
    String opponent;
    FirstDispute(String name){
        Thread opponent = new Thread(this.opponent = name);
    }
    @Override
    public void run(){
        int i;
        for (i = 1; i <= 5; i++){
            try{
                Thread.sleep((long)(Math.random() * 801) + 500);
                System.out.println(opponent);
            }catch (InterruptedException ex){
                ex.printStackTrace();
            }
        }
    }
}

class ChickenAndEgg{
    public static void main(String[] args) throws InterruptedException {
        FirstDispute chicken = new FirstDispute("Курица");
        FirstDispute egg = new FirstDispute("Яйцо");
        chicken.start();
        egg.start();
        String result;

        while(true){
            boolean chickWin = (chicken.isAlive() == true) && (egg.isAlive() == false);
            boolean eggWin = (egg.isAlive() == true) && (chicken.isAlive() == false);
            if(chickWin){
                result = "Первой появилась курица";
                break;
            }

            if(eggWin){
                result = "Первым появилось яйцо";
                break;
            }
        }
        chicken.join();
        egg.join();
        System.out.println(result);
    }
}