package ru.lanit.zoo;

import org.apache.log4j.Logger;
import ru.lanit.zoo.animals.*;
import ru.lanit.zoo.aviary.Aviary;
import ru.lanit.zoo.aviary.AviaryCarnivorous;
import ru.lanit.zoo.aviary.AviaryHerbivore;
import ru.lanit.zoo.exceptions.WrongFoodException;
import ru.lanit.zoo.food.Food;
import java.util.ArrayList;
import java.util.List;

public class Zoo {
    public static final Logger loggerConsole = Logger.getLogger("console");
    public static final Logger loggerFile = Logger.getLogger("file");

    public static void main(String[] args) {
        //Создаём хранилище с едой.
        loggerConsole.info("Создаём хранилище с едой");
        loggerFile.info("Создаём хранилище с едой");
        Food[] foods = Food.values();

        //Создаём вольеры.
        loggerConsole.info("Создаём вольеры и загоняем туда животных");
        loggerFile.info("Создаём вольеры и загоняем туда животных");
        List<Aviary> aviaries = getListAviary();


        //Стажёру поручено покормить животных,но он может ошибиться и дать им не то что нужно.
        for (Aviary aviary : aviaries) {
            for (int i = 0; i < aviary.getCount(); i++) {
                int random = (int) (Math.random() * foods.length);
                Food food = foods[random];
                Animal animal = aviary.getAnimalByIndex(i);
                System.out.println("Работник зоопарка для " + animal + " наложил еды: "
                        + food);
                try {
                    loggerConsole.info("Стажёр пытается покормить животное");
                    loggerFile.info("Стажёр пытается покормить животное");
                    animal.eat(food);
                } catch (WrongFoodException e) {
                    loggerConsole.error("Не получилось покормить животное");
                    loggerFile.error("Не получилось покормить животное");
                    System.out.println(e.getMessage());
                }
            }
        }

        //Так же не забыли про уточку
        loggerConsole.info("Вызываем уточку");
        loggerFile.info("Вызываем уточку");
        Duck duck = Duck.getInstance();
        System.out.println();
        System.out.println("Прилетела утка.");
        duck.say();
        System.out.println("Сотрудник пытается поймать утку, но безуспешно");
        duck.say();
    }


    private static List<Aviary> getListAviary() {
        List<Aviary> list = new ArrayList<>();
        list.add(new AviaryCarnivorous(5));
        list.add(new AviaryCarnivorous(4));
        list.add(new AviaryHerbivore(6));
        list.add(new AviaryHerbivore(3));

        for (int i = 0; i < list.get(0).getSize(); i++) {
            list.get(0).addAnimal(new Tiger());
        }
        for (int i = 0; i < 2; i++) {
            list.get(1).addAnimal(new Lion());
        }

        for (int i = 0; i < 2; i++) {
            list.get(2).addAnimal(new Zebra());
        }

        for (int i = 0; i <list.get(3).getSize(); i++) {
            list.get(3).addAnimal(new Giraffe());
        }

        return list;
    }

}
