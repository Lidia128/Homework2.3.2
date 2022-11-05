public class Predators extends Mammals {
    public Predators(String name, int age, String livingEnvironment, int speedGO) {
        super(name, age, livingEnvironment, speedGO);
    }

    @Override
    public void eat() {
        System.out.println("Ем только мясо.");
    }

    @Override
    public void go() {
        System.out.println("Перемещение - это гулять и охотиться.");
    }

    public void printInfoPredators() {
        System.out.println(getName() + " " + getAge() + " лет живет в " + getLivingEnvironment() + ".");
    }
}