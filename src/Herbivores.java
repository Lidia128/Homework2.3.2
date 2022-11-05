public class Herbivores extends Mammals {

    public Herbivores(String name, int age, String livingEnvironment, int speedGo) {
        super(name, age,livingEnvironment, speedGo);
            }

    @Override
    public void eat() {
        System.out.println("Тип пищи - растения.");
    }

    @Override
    public void go() {
        System.out.println("Перемещение - это гулять и пастись.");
    }
    public void printInfoHerbivores () {
        System.out.println(getName() + " " + getAge() + " лет живет в " + getLivingEnvironment()+".");

    }

    }

