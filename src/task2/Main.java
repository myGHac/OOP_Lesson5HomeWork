package task2;

public class Main {

    public static void main(String[] args) {

        Device device = new Device("Samsung", 120, "AB1234567CD");

         Device monitor = new Monitor("Samsung", 120,
                "AB1234567CD", 1280,1024);

         Device monitor1 = new Monitor("LG", 130,
                 "AS1234741CD", 1920,1080);

        System.out.println(device.toString());
        System.out.println(monitor.toString());


        System.out.println(device.equals(monitor));

        System.out.println(monitor.equals(monitor1));

        System.out.println(device.hashCode());
        System.out.println(monitor.hashCode());
        System.out.println(monitor1.hashCode());
    }
}
