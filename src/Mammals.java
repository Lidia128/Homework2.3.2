public class Mammals extends Animals {
    private int speedGO;

    public Mammals(String name, int age, String livingEnvironment, int speedGO) {
        super(name, age, livingEnvironment);
        if (speedGO <= 0) {
            this.speedGO = 0;
        } else {
            this.speedGO = speedGO;
        }
    }

    public Mammals(String name, int age, String livingEnvironment) {
        super(name, age, livingEnvironment);
    }

    public int getSpeedGO() {
        return speedGO;
    }

    public void setSpeedGO(int speedGO) {
        if (speedGO <= 0) {
            this.speedGO = 0;
        } else {
            this.speedGO = speedGO;
        }
    }

    public void eat() {

    }

    @Override
    public void go() {
    }

    @Override
    public void sleep() {

    }
}
