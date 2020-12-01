package task2;

import java.util.Objects;

public class Monitor extends Device {
    private int resolutionX;
    private int resolutionY;

    public void EthernetAdapter(int speed, String mac) {

    }

    public Monitor(String manufacturer, float price, String serialNumber, int resolutionX, int resolutionY) {
        super(manufacturer, price, serialNumber);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    public int getResolutionX() {
        return resolutionX;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "manufacturer= '" + super.getManufacturer() + '\'' +
                ", price= " + super.getPrice() +
                ", serialNumber= " + super.getSerialNumber() +
                ", resolutionX=" + resolutionX +
                ", resolutionY= " + resolutionY +
                '}';
    }

    @Override
    public boolean equals(Object o) {

        Monitor monitor = (Monitor) o;

            return  resolutionX == monitor.resolutionX &&
                    resolutionY == monitor.resolutionY;
    }
        @Override
        public int hashCode () {
        int result = 37;

        result += super.hashCode();
        result += getPrice();
            return result;
        }
    }
