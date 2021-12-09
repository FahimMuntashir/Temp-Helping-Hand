public class Vehicles {
    private String name;
    private double weight;
    private int numberofSeats;
    private double numberOfKTravelled;


    public Vehicles() {

    }


    public Vehicles(String name, double weight, int numberofSeats, double numberOfKTravelled) {
        this.name = name;
        this.weight = weight;
        this.numberofSeats = numberofSeats;
        this.numberOfKTravelled = numberOfKTravelled;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getNumberofSeats() {
        return numberofSeats;
    }

    public void setNumberofSeats(int numberofSeats) {
        this.numberofSeats = numberofSeats;
    }

    public double getNumberOfKTravelled() {
        return numberOfKTravelled;
    }

    public void setNumberOfKTravelled(double numberOfKTravelled) {
        this.numberOfKTravelled = numberOfKTravelled;
    }


}
