package exam1;

import java.util.Date;
import java.util.Random;

public class Farmer {
    protected String farmer;
    protected int farmerResourse;

    public Farmer(String farmer) {
        this.farmer = farmer;
        this.farmerResourse = 5;
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

    public void collectResourse(Pets[] pets) {
        for (int i = 0; i < pets.length; i++) {
            if (pets[i] instanceof CanGiveResourse && pets[i].onFarm == true) {
                farmerResourse += pets[i].resourse;
            }
        }
    }

    Random random = new Random(new Date().getTime());

    public void canAway(WildAnimals myAnimal) {
        if (random.nextBoolean() == true) {

        }
    }


}
