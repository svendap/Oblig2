package no.hiof.svendap;

public class Planet {
    private String name;
    private double radius;
    private double mass;


    public Planet(String name, double radius, double mass) {
        this.name = name;
        this.radius = radius;
        this.mass = mass;
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

    public double getPlanetRadiusInKm() { // converts Rjup to Km.
        double Rjup = 71492;
        double planetRadiusInKm;
        planetRadiusInKm = getRadius() * Rjup;
        return planetRadiusInKm;
    }

    public double getPlanetMassInKg() { // converts Mjup to Kg.
        double Mjup = 1.898E27;
        double planetMassInKg;
        planetMassInKg = getMass() * Mjup;
        return planetMassInKg;
    }

    public double getPlanetRadiusInM() { //converts Km to M.
        double planetRadiusInM;
        planetRadiusInM = getPlanetRadiusInKm() * 1000;
        return planetRadiusInM;
    }

    public double getSurfaceGravity() { //finds the surface gravity of a planet.
        double gravityConstant = 6.67408E-11;
        double surfaceGravity;
        surfaceGravity = gravityConstant * getPlanetMassInKg() / Math.pow(getPlanetRadiusInM(), 2);
        return surfaceGravity;
    }

    //********Bonusoppgave 3.1***********
    public double getPlanetMassInMearth() { //converts planet mass from Kg to Mearth.
        double Mearth = 5.972E24;
        double planetMassInMearth;
        planetMassInMearth = getPlanetMassInKg() / Mearth;
        return planetMassInMearth;
    }

    public double getPlanetRadiusInRearth() { //converts planet radius from Km to Rearth.
        double Rearth = 6371;
        double planetRadiusInRearth;
        planetRadiusInRearth = getPlanetRadiusInKm() / Rearth;
        return planetRadiusInRearth;
    }
    //*************************************


    //Oppgave 2.3
    @Override
    public String toString() {
        return name + "`s radius is " + radius + " Rjup" + " and has a mass off " + mass + " Mjup\n";
    }
}

