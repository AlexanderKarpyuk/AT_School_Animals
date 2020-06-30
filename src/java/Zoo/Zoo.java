package Zoo;

import Animals.*;
import Food.*;

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
    }
}
