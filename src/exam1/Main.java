package exam1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Farmer farmer = new Farmer("Фермер", 5);
        // здесь заполняем массивы домашних и диких животных и запускаем метод "День на ферме"

        // добавляем домашних животных
        Rabbit rabbit0 = new Rabbit("Кролик 0", 3, 5, 1, 1, 3, true);
        Rabbit rabbit1 = new Rabbit("Кролик 1", 3, 5, 1, 1, 3, true);
        Rabbit rabbit2 = new Rabbit("Кролик 2", 3, 5, 1, 1, 3, true);
        Rabbit rabbit3 = new Rabbit("Кролик 3", 3, 5, 1, 1, 3, true);

        Chicken chicken0 = new Chicken("Курица 0", 3, 2, 1, 1, 3, true);
        Chicken chicken1 = new Chicken("Курица 1", 3, 2, 1, 1, 3, true);
        Chicken chicken2 = new Chicken("Курица 2", 3, 2, 1, 1, 3, true);
        Chicken chicken3 = new Chicken("Курица 3", 3, 2, 1, 1, 3, true);

        Cat1 cat1 = new Cat1("Кот", 3, 3, 1, 1, 0, true);
        Cow cow = new Cow("Корова", 10, 1, 6, 6, 6, true);

        // добавляем хищников
        Wolf1 wolf1 = new Wolf1("Волк", 7, 4, 3, 0);
        Fox fox = new Fox("Лиса", 4, 3, 3, 0);
        Bear bear = new Bear("Медведь", 10, 2, 7, 0);

        // заполняем массив домашних животных
        Farm farm = new Farm(); farm.addPets(rabbit0); farm.addPets(rabbit1); farm.addPets(rabbit2); farm.addPets(rabbit3);
        farm.addPets(chicken0); farm.addPets(chicken1); farm.addPets(chicken2); farm.addPets(chicken3);
        farm.addPets(cat1); farm.addPets(cow);

        // заполняем массив хищников
        farm.addWildAnimals(wolf1); farm.addWildAnimals(fox); farm.addWildAnimals(bear);

        while (farmer.farmerResourse > 0) {
            farm.dayOnFarm();  // День на ферме
            System.out.println("Ресурсы закончиились");
        }

    }

}
