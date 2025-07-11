package a01interfacedemo5;

public class Test {
    public static void main(String[] args) {
        //创建对象
        pingpongPlayer pingpongPlayer = new pingpongPlayer("马龙",29);
        System.out.println(pingpongPlayer.getName()+","+pingpongPlayer.getAge());
        pingpongPlayer.study();
        pingpongPlayer.speakEnglish();

        System.out.println("======================");

        basketballPlayer basketballPlayer = new basketballPlayer("欧文",27);
        System.out.println(basketballPlayer.getName()+","+basketballPlayer.getAge());
        basketballPlayer.study();

        System.out.println("======================");

        pingpongCoach pingpongCoach = new pingpongCoach("刘国柱",40);
        System.out.println(pingpongCoach.getName()+","+pingpongCoach.getAge());
        pingpongCoach.teach();
        pingpongCoach.speakEnglish();

        System.out.println("======================");

        basketballCoach basketballCoach = new basketballCoach("kobi",39);
        System.out.println(basketballCoach.getName()+","+basketballCoach.getAge());
        basketballCoach.teach();
    }
}
