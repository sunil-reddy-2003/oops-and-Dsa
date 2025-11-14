package OOPS.interfaces.vehicles;

public class Main {
    public static void main(String[] args) {
//        Car car = new Car();
//        car.start();
//        car.stop();
//        car.acc();
//        car.brake();


        // which version to access will be mentioned by the object "new Car()"
        // what to access will be mentioned by "Engine car"
        //its type is Engine, so it can access only methods which are present in Engine
//        Engine car = new Car();
//        car.acc();
//        car.start();
//        car.stop();
//
////        car.brake();
//        ((Car) car).brake();


        // engine stop when we try to stop the media
//        Media carMedia = new Car();
//        carMedia.stop();

        NiceCar car= new NiceCar();
        car.start();
        car.startMusic();
        car.upgradeEngine();
        car.start();
    }
}
