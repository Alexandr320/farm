package exam1;

public class Forest {

    WildAnimals[] wildAnimals = new WildAnimals[3];

    public void addWildAnimals(WildAnimals wildAnimal) {
        for (int i = 0; i < wildAnimals.length; i++) {
            if (wildAnimals[i] == null) {
                wildAnimals[i] = wildAnimal;
            }
        }
    }
}
