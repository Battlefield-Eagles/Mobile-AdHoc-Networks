package Modules;

public class XBeeModule extends Module{

    public XBeeModule(double power, double powerperunit) {
        super(power, powerperunit);
    }

    public void sendMessage(){
        consumePower();
    }
}
