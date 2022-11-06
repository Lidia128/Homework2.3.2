public class Flying extends Birds {
    public Flying(String name, int age, String livingEnvironment) {
        super(name, age, livingEnvironment);
    }

    @Override
    public void eat() {
        System.out.println("Ем мелких грызунов и рыбу.");
    }

    @Override
    public void go() {
        System.out.println("Тип перемещения - летаю на охоту.");
    }

    @Override
    public void sleep() {
        super.sleep();
    }

    public void printInfoFlying() {
        System.out.println(getName() + " " + getAge() + " лет живет в " + getLivingEnvironment() + ".");
    }
}
