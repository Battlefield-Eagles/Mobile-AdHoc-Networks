package Nodes;

import Modules.BluetoothModule;
import Modules.GPSmodule;
import Modules.RFModule;
import Modules.XBeeModule;

public class SoldierNode {
    private GPSmodule GPS;
    private RFModule RF;
    private BluetoothModule BLE;
    private XBeeModule XBEE;
    private double latitude;
    private double longitude;
    private static double power;

    public SoldierNode(double latitude, double longitude, double power) {
        this.GPS = new GPSmodule(SoldierNode.power,10, latitude, longitude);
        this.RF = new RFModule(SoldierNode.power, 8);
        this.BLE = new BluetoothModule(SoldierNode.power, 3);
        this.XBEE = new XBeeModule(SoldierNode.power, 5);
        this.latitude = latitude;
        this.longitude = longitude;
        SoldierNode.power = power;
    }

    public double[] getPosition(){
        return new double[]{latitude, longitude};
    }
}
