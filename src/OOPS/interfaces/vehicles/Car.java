package OOPS.interfaces.vehicles;

public class Car implements Engine,Brake,Media{

    @Override
    public void brake() {
        System.out.println("inside Engine brake");
    }

    @Override
    public void start() {
        System.out.println("inside Engine start");
    }

    @Override
    public void stop() {
        System.out.println("inside Engine stop");
    }

    @Override
    public void acc() {
        System.out.println("inside Engine accelerate");
    }
}
