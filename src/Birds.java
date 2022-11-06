public class Birds extends Animals {
    public Birds(String name, int age, String livingEnvironment) {
        super(name, age, livingEnvironment);
    }

    @Override
    public void eat() {
        System.out.println("Клюет зерна");

    }

    @Override
    public void go() {

    }

    @Override
    public void sleep() {

    }
}
