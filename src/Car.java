public class Car extends Transport {
    int vin;
    int number;
    @Override
    public void move() {
        System.out.println("car is moving");
    }








    public void setVin(int vin) {
        this.vin = vin;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getVin() {
        return vin;
    }

    public int getNumber() {
        return number;
    }
}
