public class BigPlanes extends AirVehicles{

    private double luggageCapacity;

    public BigPlanes(double luggageCapacity) {
        this.luggageCapacity = luggageCapacity;
    }

    public BigPlanes(double radiusOfPropellers, double luggageCapacity) {
        super(radiusOfPropellers);
        this.luggageCapacity = luggageCapacity;
    }

    public double getLuggageCapacity() {
        return luggageCapacity;
    }

    public void setLuggageCapacity(double luggageCapacity) {
        this.luggageCapacity = luggageCapacity;
    }
}
