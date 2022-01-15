package ru.gb.java1.lesson7;

import java.util.Scanner;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int f) {

        if (chekPlate(f)) {
            food = food - f;
            return true;
        } else {
            return false;
        }
    }

    public boolean chekPlate(int f) {
        if (f <= food) {
            return true;
        }
        return false;
    }

    public boolean addFood() {
        int food = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Добавте еду в тарелку");
        food = scan.nextInt();
        this.food = this.food + food;
        System.out.println("Теперь в тарелке "+ this.food+" еды.");
        scan.close();
        return true;
    }

    public int getFood() {
        return food;
    }
}
