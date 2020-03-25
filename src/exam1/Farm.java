package exam1;

public class Farm {
    Farmer farmer;

    Pets[] pets = new Pets[10];

    public void addPets(Pets myPet) {
        for (int i = 0; i < pets.length; i++) {
            if (pets[i] == null) {
                pets[i] = myPet;
            }
        }
    }

    public void dayOnFarm() {
        farmer.farmerResourse -= 2;
        farmer.collectResourse(pets);
    }
}
