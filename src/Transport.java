public class Transport {
    private String name;
    private int seats;
    private int sedan;
    private int pickup;


    public void setSedan(int sedan) {
        this.sedan = sedan;
    }

    public void setPickup(int pickup) {
        this.pickup = pickup;
    }

    public int getSedan() {
        System.out.println("sedan");
        return sedan;
    }

    public int getPickup() {
        System.out.println("pickup");
        return pickup;
    }

    public void transportType() {


    }
    public void move(){
        System.out.println("transport is moving");
    }
    public void options(){
        System.out.println("i can move back and forward");
    }

    public Transport() {
        System.out.println("a new Transport object is created");
    }


    public void setSeats(int seats) {
        if ( seats > 20 );
        else {
            System.out.println("20 seats MAX");
        }
        this.seats = seats;
    }

    public int getSeats() {
        return seats;
    }


}
