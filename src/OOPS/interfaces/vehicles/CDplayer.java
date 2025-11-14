package OOPS.interfaces.vehicles;

public class CDplayer implements Media{
    @Override
    public void start() {
        System.out.println("CDplayer music start");
    }

    @Override
    public void stop() {
        System.out.println("CDplayer music stop");
    }
}
