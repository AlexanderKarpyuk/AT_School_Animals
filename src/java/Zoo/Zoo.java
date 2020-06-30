package Zoo;

import Animals.*;
import Food.*;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    public static void main(String[] args) {
        //Создаём хранилище с едой.
        Food[] foods = new Food[] {new Beef(), new Carrot(), new Grass(), new Bull()};

        //Создаём вольеры и указываем их размеры.
        AviaryCarnivorous aviaryCarnivorous1 = new AviaryCarnivorous(5);
        AviaryCarnivorous aviaryCarnivorous2 = new AviaryCarnivorous(4);

        AviaryHerbivore aviaryHerbivore1 = new AviaryHerbivore(6);
        AviaryHerbivore aviaryHerbivore2 = new AviaryHerbivore(3);

        //Загоняем животных в вольеры.
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
        List<Aviary> aviaries = new ArrayList<Aviary>();
        aviaries.add(aviaryHerbivore1);
        aviaries.add(aviaryHerbivore2);
        aviaries.add(aviaryCarnivorous1);
        aviaries.add(aviaryCarnivorous2);

        //Стажёру поручено покормить животных,но он может ошибиться и дать им не то что нужно.
        for (Aviary aviary : aviaries) {
            for (int i = 0; i < aviary.getSize(); i++) {
                int random = (int) (Math.random() * foods.length);
                Animal animal = aviary.getAnimalByIndex(i);
                animal.eat(foods[random]);
            }
        }

    }
}
