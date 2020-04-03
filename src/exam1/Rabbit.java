package exam1;

public class Rabbit extends Pets implements CanEatenFarmer { // может съесть фермер
    // животное класса Pets, кролик, не дает ресурсы, пригодно в пищу

    public Rabbit(String name, int weight, int speed, int maxHealthScore, int healthScore, int recourse, boolean onFarm) {
        super(name, weight, speed, maxHealthScore, healthScore, recourse, onFarm);
    }
}
