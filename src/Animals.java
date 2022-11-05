import java.util.Objects;

public abstract  class Animals {
    private String name;
    private int age;
    private String livingEnvironment;

    public Animals(String name) {
        if (name != null && !name.isEmpty() && !name.isBlank()) {
            this.name = name;
        } else {
            this.name = "животное";
        }
    }
    public Animals(String name, int age) {
        this.name = name;
        if (age <= 0) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }
    public Animals(String name, int age, String livingEnvironment) {
        this.name = name;
        this.age = age;
        if (livingEnvironment != null && !livingEnvironment.isEmpty() && !livingEnvironment.isBlank()) {
            this.livingEnvironment = livingEnvironment;
        } else {
            this.livingEnvironment = "среда обитания не известна";
        }
    }
        public int getAge () {
            return age;
        }
        public String getName () {
            return name;
        }
        public void setName (String name){
            if (name != null && !name.isEmpty() && !name.isBlank()) {
                this.name = name;
            } else {
                this.name = "животное";
            }
        }
    public String getLivingEnvironment() {
        return livingEnvironment;
    }
        public abstract  void eat ();
        public abstract void sleep ();
        public abstract void go ();

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", livingEnvironment='" + livingEnvironment + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return age == animals.age && Objects.equals(name, animals.name) && Objects.equals(livingEnvironment,
                animals.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, livingEnvironment);
    }
}



