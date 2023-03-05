public class Transport {
    private String name;
    private int seats;

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

        if ( seats > 20 ) {
            this.seats = seats;
        }
        else {
            System.out.println("20 seats MAX");
        }

    }

    public int getSeats() {
        return seats;
    }


}
