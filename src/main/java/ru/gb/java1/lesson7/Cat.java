package ru.gb.java1.lesson7;

public class Cat {
    private String name;
    private int appetit;
    private boolean full;

    public Cat(String name, int appetit) {
        this.name = name;
        this.appetit = appetit;
    }

    public void eat(Plate p) {
        if (this.full) {
            System.out.println("Кот " + this.getName() + " уже сыт.");
        } else {
            if (p.decreaseFood(this.appetit)) {
                this.full = true;
                System.out.println("Кот " + this.name + " поел.");
            } else {
                this.full = false;
                System.out.println("Коту " + this.name + " нехватило еды.");
            }
        }
    }

    public String getName() {
        return name;
    }

    public boolean isFull() {
        return full;
    }
}
