package exam1;

public class Chicken extends Pets implements CanEatenFarmer, // может съесть фермер
                                            CanGiveResourse { // дает ресурс
    // животное класса Pets, курица, дает ресурсы, пригодно в пищу

    public Chicken(String name, int weight, int speed, int maxHealthScore, int healthScore, int recourse, boolean onFarm) {
        super(name, weight, speed, maxHealthScore, healthScore, recourse, onFarm);
    }


}
