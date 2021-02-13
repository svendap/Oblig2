package no.hiof.svendap;

public class Star {
    private String name;
    private double radius;
    private double mass;
    private int effectiveTemp;

    public Star(String name, double radius, double mass, int effectiveTemp) {
        this.name = name;
        this.radius = radius;
        this.mass = mass;
        this.effectiveTemp = effectiveTemp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public int getEffectiveTemp() {
        return effectiveTemp;
    }

    public void setEffectiveTemp(int effectiveTemp) {
        this.effectiveTemp = effectiveTemp;
    }

    public double getStarRadiusInKm() { // converts Rsun to Km.
        double Rsun = 695700;
        double starRadiusInKm;
        starRadiusInKm = getRadius() * Rsun;
        return starRadiusInKm;
    }

    public double getStarMassInKg() { // converts Msun to KG.
        double Msun = 1.98892E30;
        double starMassInKg;
        starMassInKg = getMass() * Msun;
        return starMassInKg;
    }

    //Oppgave 2.3
    @Override
    public String toString() {
        return name + ", radius=" + radius + " Rsun, mass=" + mass + " Msun, effectiveTemp=" + effectiveTemp;
    }
}
