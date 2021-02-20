package no.hiof.svendap;

public class NaturalSatellite extends CelestialBody{
    private double semiMajorAxis;
    private double eccentricity;
    private double orbitalPeriod;
    static final double AU =149597871;

    public NaturalSatellite(String name, double radius, double mass, double semiMajorAxis, double eccentricity, double orbitalPeriod) {
        super(name, radius, mass);
        this.semiMajorAxis = semiMajorAxis;
        this.eccentricity = eccentricity;
        this.orbitalPeriod = orbitalPeriod;
    }

    public double distanceToCentralBody(double degrees) {// uses degrees as input.
        degrees = Math.toRadians(degrees);
        return ((semiMajorAxis * (1 - Math.pow(eccentricity, 2))) / (1 + (eccentricity * Math.cos(degrees)))) * AU;
    }

    public double distanceToCentralBodyRadiansInput(double radians) { //uses radians as input.
        return ((semiMajorAxis * (1 - Math.pow(eccentricity, 2))) / (1 + (eccentricity * Math.cos(radians)))) * AU;
    }

    public double getSemiMajorAxis() {
        return semiMajorAxis;
    }

    public void setSemiMajorAxis(double semiMajorAxis) {
        this.semiMajorAxis = semiMajorAxis;
    }

    public double getEccentricity() {
        return eccentricity;
    }

    public void setEccentricity(double eccentricity) {
        this.eccentricity = eccentricity;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public void setOrbitalPeriod(double orbitalPeriod) {
        this.orbitalPeriod = orbitalPeriod;
    }

    @Override
    public double getMassInKg() {
        return 0;
    }

    @Override
    public double getRadiusInKm() {
        return 0;
    }
}
