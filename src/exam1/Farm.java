package exam1;

public class Farm {
    // Ферма, содержит объявление массива животных на ферме (10 животных) и метод addPets по добавлению
    Farmer farmer; // фермер

    Pets[] pets = new Pets[10]; // массив с домашними животными

    public void addPets(Pets myPet) {          // метод добавления домашних животных
        for (int i = 0; i < pets.length; i++) {
            if (pets[i] == null) {
                pets[i] = myPet;
            }
        }
    }

    public WildAnimals[] wildAnimals = new WildAnimals[3];

    public void addWildAnimals(WildAnimals wildAnimal) {  // метод добавления диких животных
        for (int i = 0; i < wildAnimals.length; i++) {
            if (wildAnimals[i] == null) {
                wildAnimals[i] = wildAnimal;
            }
        }
    }

    public void dayOnFarm() {     // метод "День на ферме"
        farmer.farmerResourse -= 2;
        if (farmer.farmerResourse > 0) {   // проверили условие наличия ресурсов у фермера
            int i = (int)(Math.random()*wildAnimals.length);  // случайно выбрали хищника из массива
            int j = (int)(Math.random()*pets.length);   // случайно выбрали домаш. животное из массива
            wildAnimals[i].eatAnimals(pets[i]);    // запустили метод по съедению i-м хищником j-го животного
            farmer.canAway(wildAnimals[i]);   // фермер пытается прогнать хищника
            for (int k = 0; k < pets.length; k++) {  // вызываем метод кормления и лечения живых питомцев
                pets[i].EatAndHeal(pets[i]);
            }
            farmer.checkPetsResourse(pets); // метод проверки наличия живых носителей ресурса
            if (farmer.checkPetsResourse(pets) == 0) {   //фермер съедает живого питомца, которого можно съесть
                for (int k = 0; k < pets.length; k++) {
                    if (pets[i].onFarm && pets[i] instanceof CanEatenFarmer) {
                        farmer.farmerResourse += pets[i].weight; // ресурсы добавлены
                        pets[i].onFarm = false;                 // питомец съеден
                    }
                }
            }
            farmer.collectResourse(pets);   // запустили метод сбора ресурсов
        }
        else {
            System.out.println("Ресурсы закончились");
        }
    }
}
