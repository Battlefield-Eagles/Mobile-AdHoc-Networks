package Modules;

public class Module {
    static double power;
    double powerperunit;

    Module(double power, double powerperunit) {
        Module.power = power;
        this.powerperunit = powerperunit;
    }

    void consumePower(){
        power += powerperunit;
        System.out.println("power consumed is " + power);
    }
}
