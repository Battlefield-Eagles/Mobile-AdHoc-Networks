package Modules;

public class GPSmodule extends  Module{

    private double latitude;
    private double longitude;

    public GPSmodule(double power, double powerperunit, double latitude, double longitude) {
        super(power, powerperunit);
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public void getPosition(){
        consumePower();
    }



}
