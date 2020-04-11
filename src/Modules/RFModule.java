package Modules;

public class RFModule extends Module{

    public RFModule(double power, double powerperunit) {
        super(power, powerperunit);
    }

    public void sendMessage(){
        consumePower();
    }
}
