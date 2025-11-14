package OOPS.interfaces.vehicles;

public class NiceCar {
    private Engine engine;
    private final Media player = new CDplayer();

    public NiceCar(){
        engine=new PowerEngine();
    }
    public NiceCar(Engine engine){
        this.engine=engine;
    }
    public void start(){
        engine.start();
    }
    public void stop(){
        engine.stop();
    }
    public void startMusic(){
        player.start();
    }
    public void stopMusic(){
        player.stop();
    }
    public void upgradeEngine(){
        this.engine=new ElectricEngine() ;
        System.out.println("Engine upgraded");
    }
}
