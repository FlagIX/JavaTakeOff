package a01innerclassdemo1;

public class Car {
    String carName;
    int carAge;
    String carColor;

    public void show(){
        engine e = new engine();
        System.out.println(e.engineName);
    }
    class engine{
        String engineName;
        int engineage;
        public void show(){
            System.out.println(carName);
            System.out.println(carAge);
            System.out.println(carColor);
        }
    }
}
