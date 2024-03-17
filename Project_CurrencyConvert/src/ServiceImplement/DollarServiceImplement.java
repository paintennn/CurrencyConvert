package ServiceImplement;

import Service.DollarService;

public class DollarServiceImplement implements DollarService {
    @Override
    public double convertToVND(double value) {
        return value * 23495;
    }
    @Override
    public double convertToCAD(double value) {
        return value * 1.37025;
    }
    @Override
    public double convertToAUD(double value) {
        return value * 1.49522;
    }
    @Override
    public double convertToSGD(double value) {
        return value * 1.33685;
    }
    @Override
    public double convertToHKD(double value) {
        return  value * 7.8485;
    }
    @Override
    public double convertToCNY(double value) {
        return value * 6.8868;
    }
    @Override
    public double convertToEURO(double value) {
        return value * 0.9285;
    }
    @Override
    public double convertToRUB(double value) {
        return value * 77.25;
    }
    @Override
    public double convertToCHF(double value) {
       return value * 0.9227;
    }
    @Override
    public double convertToUSD(double value) {
        return value * 1;
    }
}
