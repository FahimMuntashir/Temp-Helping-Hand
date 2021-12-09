public class AirVehicles extends Vehicles{
    private double radiusOfPropellers;

    public AirVehicles() {
        super();
    }

    public AirVehicles(double radiusOfPropellers) {
        this.radiusOfPropellers = radiusOfPropellers;
    }

    public double getRadiusOfPropellers() {
        return radiusOfPropellers;
    }

    public void setRadiusOfPropellers(double radiusOfPropellers) {
        this.radiusOfPropellers = radiusOfPropellers;
    }
}
