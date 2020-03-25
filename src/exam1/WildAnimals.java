package exam1;

public class WildAnimals extends Animals {
    protected int power;
    protected int outcast; // изгнан


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
}
