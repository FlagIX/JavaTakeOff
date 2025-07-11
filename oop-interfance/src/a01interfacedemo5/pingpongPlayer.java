package a01interfacedemo5;

public class pingpongPlayer extends Player implements English{
    public pingpongPlayer() {
    }

    public pingpongPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("学打乒乓球");
    }

    @Override
    public void speakEnglish() {
        System.out.println("说英语");
    }
}
