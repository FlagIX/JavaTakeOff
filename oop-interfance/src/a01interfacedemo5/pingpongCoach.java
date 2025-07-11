package a01interfacedemo5;

public class pingpongCoach extends Coach implements English{
    public pingpongCoach() {
    }

    public pingpongCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("教打乒乓球");
    }

    @Override
    public void speakEnglish() {
        System.out.println("说英语");
    }
}
