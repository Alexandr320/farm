package exam1;

public class WildAnimals extends Animals implements CanEatenAnimal {
    // класс "Дикие животные"
    protected int power;  // сила удара дикого животного, может ранить или убить домашнее
    protected int outcast; // изгнан, ЕСЛИ изгнан три раза, НЕ МОЖЕТ больше нападать


    public WildAnimals(String name, int weight, int speed, int power, int outcast) {
        super(name, weight, speed);
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int isOutcast() {
        return outcast;
    }

    public void setOutcast(int outcast) {
        this.outcast = outcast;
    }

    @Override
    public void eatAnimals(Pets myPet) {
        if (myPet.speed < speed && outcast <4) {   // если не убежал и если изгнан фермером меньше 4-х раз
            myPet.healthScore -= power;
            if (myPet.healthScore <= 0) {
                myPet.onFarm = false;   // если животное съедено, меняем флаг
            }
        }
    }
}
