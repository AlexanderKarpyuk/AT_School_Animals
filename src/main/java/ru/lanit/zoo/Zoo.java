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
        loggerConsole.info("Создаётся хранилище с едой");
        loggerFile.info("Создаётся хранилище с едой");
        Food[] foods = Food.values();

        //Создаём вольеры и указываем их размеры.
        loggerConsole.info("Создаём вольеры");
        loggerFile.info("Создаём вольеры");
        AviaryCarnivorous aviaryCarnivorous1 = new AviaryCarnivorous(5);
        AviaryCarnivorous aviaryCarnivorous2 = new AviaryCarnivorous(4);

        AviaryHerbivore aviaryHerbivore1 = new AviaryHerbivore(6);
        AviaryHerbivore aviaryHerbivore2 = new AviaryHerbivore(3);

        //Загоняем животных в вольеры.
        loggerConsole.info("Загоняем животных в вольеры");
        loggerFile.info("Загоняем животных в вольеры");
        for (int i = 0; i < aviaryCarnivorous1.getSize(); i++) {
            aviaryCarnivorous1.addAnimal(new Tiger());
        }
        for (int i = 0; i < 2; i++) {
            aviaryCarnivorous2.addAnimal(new Lion());
        }

        for (int i = 0; i < 2; i++) {
            aviaryHerbivore1.addAnimal(new Zebra());
        }

        for (int i = 0; i < aviaryHerbivore2.getSize(); i++) {
            aviaryHerbivore2.addAnimal(new Giraffe());
        }

        //Заносим вольеры в список, чтобы было проще с ними работать
        loggerConsole.info("Заносим вольеры в список");
        loggerFile.info("Заносим вольеры в список");
        List<Aviary> aviaries = new ArrayList<>();
        aviaries.add(aviaryHerbivore1);
        aviaries.add(aviaryHerbivore2);
        aviaries.add(aviaryCarnivorous1);
        aviaries.add(aviaryCarnivorous2);

        //Стажёру поручено покормить животных,но он может ошибиться и дать им не то что нужно.
        for (Aviary aviary : aviaries) {
            for (int i = 0; i < aviary.getCount(); i++) {
                int random = (int) (Math.random() * foods.length);
                Food food = foods[random];
                Animal animal = aviary.getAnimalByIndex(i);
                System.out.println("Работник зоопарка для " + animal + " наложил еды: "
                        + food);
                try {
                    loggerConsole.info("Стажёр пытается покормить животного");
                    animal.eat(food);
                } catch (WrongFoodException e) {
                    loggerConsole.error("Не получилось покормить животное");
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

}
