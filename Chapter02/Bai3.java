package Chapter02;

public class Bai3 {

    public static void main(String[] args) {
        HomeTheaterFacade homeTheater = new HomeTheaterFacade();
        homeTheater.watchMovie();
    }
}

class TV {
    void on() {
        System.out.println("TV ON");
    }
}

class SoundSystem {
    void on() {
        System.out.println("Sound System ON");
    }
}

class DVDPlayer {
    void on() {
        System.out.println("DVD Player ON");
    }
}

class HomeTheaterFacade {

    private TV tv = new TV();
    private SoundSystem sound = new SoundSystem();
    private DVDPlayer dvd = new DVDPlayer();

    public void watchMovie() {
        System.out.println("Preparing Home Theater...");
        tv.on();
        sound.on();
        dvd.on();
    }
}