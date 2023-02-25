public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Transport transport = new Transport();
        transport.move();
        transport.options();
        transport.setSeats(21);
        int a = transport.getSeats();
        Car car = new Car();
        car.move();
        car.options();

    }
}