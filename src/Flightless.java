public class Flightless extends Birds {
    public Flightless(String name, int age, String livingEnvironment) {
        super(name, age, livingEnvironment);
    }

    @Override
    public void eat() {
        System.out.println("Ем насекомых и растения.");
    }

    @Override
    public void go() {
        System.out.println("Тип перемщения - гуляю.");
    }

    @Override
    public void sleep() {
        super.sleep();
    }

    public void printInfoFlinghless() {
        System.out.println(getName() + " " + getAge() + " лет живет в " + getLivingEnvironment() + ".");
    }
}
