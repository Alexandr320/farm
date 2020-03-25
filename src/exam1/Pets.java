package exam1;

public class Pets extends Animals {
    // имя, вес, скорость, здоровье, количество ресурсов (у каждого свое и 0, если животное на дает ресурс)
    protected int healthScore;
    protected int resourse;
    protected boolean onFarm;


    public Pets(String name, int weight, int speed, int healthScore, int resourse, boolean onFarm) {
        super(name, weight, speed);
    }

    public int getHealthScore() {
        return healthScore;
    }

    public void setHealthScore(int healthScore) {
        this.healthScore = healthScore;
    }

    public int getResourse() {
        return resourse;
    }

    public void setResourse(int resourse) {
        this.resourse = resourse;
    }

    public boolean isOnFarm() {
        return onFarm;
    }

    public void setOnFarm(boolean onFarm) {
        this.onFarm = onFarm;
    }
}
