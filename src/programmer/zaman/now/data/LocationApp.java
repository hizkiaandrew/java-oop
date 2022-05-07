package programmer.zaman.now.data;

public class LocationApp {
    public static void main(String[] args) {
//        var location = new Location(); -> It will error
        var city = new City();
        city.name = "Jakarta";

        System.out.println("Name : " + city.name);
    }
}
