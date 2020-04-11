package Modules;

public class BluetoothModule extends Module{

    public BluetoothModule(double power, double powerperunit) {
        super(power, powerperunit);
    }

    public void sendMessage(){
        consumePower();
    }

}
