public class Main {
    public static void main(String[] args) {
        Amphibians frog = new Amphibians("Лягушка - земноводное", 3, "болотe");
        Amphibians snake = new Amphibians("Уж пресноводный - земноводное", 1, "рекe");
        Herbivores gazelle = new Herbivores("Газель - травоядное млекопитающее", 15, "саванна",
                97);
        Herbivores giraffe = new Herbivores("Жираф - травоядное млекопитаюдщее", 10, "Африка",
                60);
        Herbivores horse = new Herbivores("Лошадь - травоядное млекопитающее", 25, "степь",
                88);
        Predators hyena = new Predators("Гиена - хищное млекопитающее", 8, "Северная Африка",
                64);
        Predators tiger = new Predators("Тигр - хищное млекопитающее", 13, "смешанный лес",
                60);
        Predators bear = new Predators("Медведь - хищное млекопитающее", 4, "тайга",
                50);
        Flightless peacock = new Flightless("Павлин - нелетающая птица", 2, "Пакисан");
        Flightless penguin = new Flightless("Пингвин - нелетающая птица", 7, "Антарктика");
        Flightless dodo = new Flightless("Птица додо - нелетающая птица", 16, "леса");
        Flying gull = new Flying("Чайка - летающая птица", 9, "у моря");
        Flying albatross = new Flying("Альбатрос - летающая птица", 21, "Южный океан");
        Flying falcon = new Flying("Сокол - летающая птица", 11, "пустыня");
        frog.printInfoAmphibians();
        frog.eat();
        frog.sleep();
        frog.go();
        System.out.println(frog.equals(frog));
        snake.printInfoAmphibians();
        snake.eat();
        snake.sleep();
        snake.go();
        gazelle.printInfoHerbivores();
        gazelle.eat();
        gazelle.sleep();
        giraffe.go();
        giraffe.printInfoHerbivores();
        giraffe.eat();
        giraffe.sleep();
        giraffe.go();
        horse.printInfoHerbivores();
        horse.eat();
        horse.sleep();
        horse.go();
        hyena.printInfoPredators();
        hyena.eat();
        hyena.sleep();
        hyena.go();
        tiger.printInfoPredators();
        tiger.eat();
        tiger.sleep();
        tiger.go();
        bear.printInfoPredators();
        bear.eat();
        bear.sleep();
        bear.go();
        peacock.printInfoFlinghless();
        peacock.eat();
        peacock.sleep();
        peacock.go();
        penguin.printInfoFlinghless();
        penguin.eat();
        penguin.sleep();
        penguin.go();
        dodo.printInfoFlinghless();
        dodo.eat();
        dodo.sleep();
        dodo.go();
        gull.printInfoFlying();
        gull.eat();
        gull.sleep();
        gull.go();
        albatross.printInfoFlying();
        albatross.eat();
        albatross.sleep();
        albatross.go();
        falcon.printInfoFlying();
        falcon.eat();
        falcon.sleep();
        falcon.go();
    }

}

