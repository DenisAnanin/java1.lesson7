package ru.gb.java1.lesson7;

public class HomeWorkApp {
    private static Cat[] cat = new Cat[5];

    public static void main(String[] args) {
        Plate plate = new Plate(50);
        Plate plate1 = new Plate(30);
        makeCats(cat);
        feedCats(cat, plate);
        hungryCat(cat);
        plate.addFood();
//        cat.eat(plate1);
//        System.out.println(plate.getFood());
//        System.out.println(plate1.getFood());
//        System.out.println(cat.isFull());


    }

    public static void makeCats(Cat[] cats) {
        for (int i = 0; i < cats.length; i++) {
            cats[i] = new Cat("Васька" + (i + 1), 10 + i);
            System.out.println("Новый кот "+cats[i].getName());
        }
    }
// Кормим котов
    public static void feedCats(Cat[] cats, Plate plate) {
        for (Cat c : cats) {
            c.eat(plate);
//            System.out.println("Остаток еды " + plate.getFood());
        }
    }
// Ищем голодных котов
    public static void hungryCat(Cat[] cats) {

        for (Cat c : cats) {
            if (!c.isFull()) {
                System.out.println(c.getName()+ " кот голоден.");
            }else {
                System.out.println(c.getName()+" кот сыт.");
            }

        }
    }
}
