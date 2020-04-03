package exam1;

import java.util.Date;
import java.util.Random;

public class Farmer {
    protected String farmer;
    protected int farmerResourse;

    public Farmer(String farmer, int farmerResourse) {
        this.farmer = farmer;
        this.farmerResourse = farmerResourse;
    }

    public String getFarmer() {
        return farmer;
    }

    public void setFarmer(String farmer) {
        this.farmer = farmer;
    }

    public int getFarmerResourse() {
        return farmerResourse;
    }

    public void setFarmerResourse(int farmerResourse) {
        this.farmerResourse = farmerResourse;
    }

    public int checkPetsResourse(Pets[] pets) {   // проверяем наличие живых питомцев, дающих ресурс
        int a = 0; // вспом. переменная подсчета живых питомцев, дающих ресурс

        for (int i = 0; i < pets.length; i++) {
            if (pets[i] instanceof CanGiveResourse && pets[i].onFarm) {
                a += 1;
            }
        }
        return a;
    }

    public void collectResourse(Pets[] pets) {     // метод - сбор ресурсов фермером
        for (int i = 0; i < pets.length; i++) {
            if (pets[i] instanceof CanGiveResourse && pets[i].onFarm) { // проверка, дает ли ресурс и живо ли
                farmerResourse += pets[i].recourse;
            }
        }
    }

    Random random = new Random(new Date().getTime());

    public void canAway(WildAnimals myAnimal) {     // метод - фермер может прогнать дикое животное с фермы
        if (random.nextBoolean()) {
            myAnimal.outcast += 1;
        }
    }
}
