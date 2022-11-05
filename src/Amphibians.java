public class Amphibians extends Animals {
    public Amphibians(String name, int age, String livingEnvironment) {
        super(name, age, livingEnvironment);
    }

    public void eat() {
        System.out.println("Eст насекомых.");
    }

    public void sleep() {
        System.out.println("Cпит в пруду.");
    }

    public void go() {
        System.out.println("Перемещается по земле.");
    }

    public void printInfoAmphibians () {
        System.out.println(getName() + " " + getAge() + " лет живет в " + getLivingEnvironment()+".");

    }
}
