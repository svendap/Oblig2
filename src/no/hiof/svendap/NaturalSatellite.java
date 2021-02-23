package no.hiof.svendap;

public abstract class NaturalSatellite extends CelestialBody{
    private double semiMajorAxis;
    private double eccentricity;
    private double orbitalPeriod;
    private Star centralCelestialBody;

    static final double AU =149597871;
    static final double gravityConstant = 6.67408E-11;



    public NaturalSatellite(String name, double radius, double mass, double semiMajorAxis, double eccentricity, double orbitalPeriod, Star centralCelestialBody) {
        super(name, radius, mass);
        this.semiMajorAxis = semiMajorAxis;
        this.eccentricity = eccentricity;
        this.orbitalPeriod = orbitalPeriod;
        this.centralCelestialBody = centralCelestialBody;
    }



    public double orbitingVelocity(double distance) {
        return (Math.sqrt((gravityConstant * centralCelestialBody.getMassInKg()) / distance)) / 1000;
    }

    public double distanceToCentralBody(double degrees) {// uses degrees as input.
        return ((semiMajorAxis * (1 - Math.pow(eccentricity, 2))) / (1 + (eccentricity * Math.cos(Math.toRadians(degrees))))) * AU;
    }

    public double distanceToCentralBodyRadiansInput(double radians) { //uses radians as input.
        return ((semiMajorAxis * (1 - Math.pow(eccentricity, 2))) / (1 + (eccentricity * Math.cos(radians)))) * AU;
    }

    public Star getCentralCelestialBody() {
        return centralCelestialBody;
    }

    public void setCentralCelestialBody(Star centralCelestialBody) {
        this.centralCelestialBody = centralCelestialBody;
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
}
