package exam1;

public class Pets extends Animals implements CanEatAndHeal {
    // класс "Домашние животные"
    // текущее здоровье, макс. здоровье,
    // количество ресурсов (у каждого свое и 0, если животное на дает ресурс), флаг onFarm
    protected int healthScore;    // текущий уровень здоровья
    protected int maxHealthScore;    // макс. уровень здоровья
    protected int recourse;   // ресурс (дает корова и курица)
    protected boolean onFarm;  // флаг - живое животное или съедено

    public Pets(String name, int weight, int speed, int maxHealthScore, int healthScore, int recourse, boolean onFarm) {
        super(name, weight, speed);
    }

    public int getMaxHealthScore() { return maxHealthScore; }

    public void setMaxHealthScore(int maxHealthScore) { this.maxHealthScore = maxHealthScore; }

    public int getHealthScore() {
        return healthScore;
    }

    public void setHealthScore(int healthScore) {
        this.healthScore = healthScore;
    }

    public int getResourse() {
        return recourse;
    }

    public void setResourse(int resourse) {
        this.recourse = resourse;
    }

    public boolean isOnFarm() {
        return onFarm;
    }

    public void setOnFarm(boolean onFarm) {
        this.onFarm = onFarm;
    }


    @Override
    public void EatAndHeal(Pets myPet) {  // переопределили метод кормления и лечения
        if (onFarm) {
            myPet.healthScore = myPet.maxHealthScore;
        }
    }
}
