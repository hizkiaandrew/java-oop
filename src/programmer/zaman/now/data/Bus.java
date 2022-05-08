package programmer.zaman.now.data;

public class Bus implements Car {
    public void drive() {
        System.out.println("Bus is driving");
    }

    public int getTire() {
        return 8;
    }

    public String getBrand() {
        return "Hino";
    }

    public boolean isBig() {
        return true;
    }
}
