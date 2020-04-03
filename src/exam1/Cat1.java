package exam1;

public class Cat1 extends Pets {
    // животное класса Pets, кот, не дает ресурсы, непригодно в пищу

    public Cat1(String name, int weight, int speed, int maxHealthScore, int healthScore, int recourse, boolean onFarm) {
        super(name, weight, speed, maxHealthScore, healthScore, recourse, onFarm);
    }
}
