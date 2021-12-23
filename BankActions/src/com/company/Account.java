package com.company;

import java.util.Scanner;

public class Account  extends Thread {
    private int balance;
    public Scanner in = new Scanner(System.in);

    Account(int bal) {
        Thread thread = new Thread();
        this.balance = bal;
    }

    public void run() {
        System.out.println("Выберите одно из действий:" +
                "1 - Пополнение баланса; " +
                "2 - Снятие денег с баланса; " +
                "3 - Узнать свой баланс.");
        int choice = in.nextInt();
            if (choice == 1) {
                moneyAdd();
            }
            if (choice == 2) {
                moneyTake();
            }
            if (choice == 3) {
                System.out.println("Ваш баланс составляет " + balance + " руб.");
            }
            if(choice > 3 && choice < 1) {
                System.out.println("Неверная команда, попробуйте еще раз");
            }
        }

    private void moneyAdd() {
        System.out.println("Введите сумму для пополнения баланса");
        int addedMoney = in.nextInt();
        balance = balance + addedMoney;
        System.out.println("Баланс пополнен на " + addedMoney + " руб., текущий баланс - " + balance);
    }

    private void moneyTake() {
        System.out.println("Введите сумму, которую хотите вы снять");
        int takenMoney = in.nextInt();
        while (balance < takenMoney) {
            System.out.println("Ошибка! Введите 1 если хотите пополнить баланс, введите 2 если хотите снять меньшую сумму");
            int choice2 = in.nextInt();
            if (choice2 == 1) {
                moneyAdd();
            }
            if (choice2 == 2) {
                moneyTake();
            }
            balance = balance - takenMoney;
            System.out.println("С баланса снято " + takenMoney + " руб., текущий баланс - " + balance);
        }
    }
}
