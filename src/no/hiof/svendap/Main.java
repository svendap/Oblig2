package no.hiof.svendap;

import java.util.ArrayList;

public class Main {
    static final double y = 147054707;

    public static void main(String[] args) {
        PlanetSystem solarSystem = getPlanetSystem();


        Planet x = solarSystem.getPlanetByName("Saturn");
        System.out.println(x);

        Planet earth = solarSystem.getPlanetByName("Earth");
        System.out.println("Earth has a distance of " + earth.distanceToCentralBody(0) + "km to the sun at 0 degrees");
        System.out.println("Earth has a distance of " + earth.distanceToCentralBody(90) + "km to the sun at 90 degrees");
        System.out.println("Earth has a distance of " + earth.distanceToCentralBody(180) + "km to the sun at 180 degrees");
        System.out.println("Earth has a distance of " + earth.distanceToCentralBody(270) + "km to the sun at 270 degrees");
        System.out.println("Earth has a distance of " + earth.distanceToCentralBody(360) + "km to the sun at 360 degrees");

        System.out.println("Earth has a distance of " + earth.distanceToCentralBodyRadiansInput(6.28318531) + "km to the sun at 6.28318531 radians");



        System.out.println("The speed is " + earth.orbitingVelocity(y * 1000) + "m/s");

    }









    private static PlanetSystem getPlanetSystem() {
        Star Sun = new Star("Sun", 1.0, 1.0,5777);
        Planet mercury = new Planet("Mercury", 0.03412549655905556, 1.7297154899894627E-4, 0.387, 0.206, 88);
        Planet venus = new Planet("Venus", 0.08465003077267387, 0.002564278187565859, 0.723, 0.007, 225);
        Planet earth = new Planet("Earth", 0.08911486599899289, 0.003146469968387777, 1, 0.017, 365);
        Planet mars = new Planet("Mars", 0.04741089912158004, 3.3667017913593256E-4, 1.524, 0.093, 687);
        Planet jupiter = new Planet("Jupiter", 1.0, 1.0, 5.20440, 0.049, 4380);
        Planet saturn = new Planet("Saturn", 0.8145247020645666, 0.2994204425711275, 9.5826, 0.057, 10585);
        Planet uranus = new Planet("Uranus", 0.35475297935433336, 0.04573761854583773, 19.2184, 0.046, 30660);
        Planet neptune = new Planet("Neptune", 0.34440217087226543, 0.05395152792413066, 30.11, 0.010, 60225);

        ArrayList<Planet> planets = new ArrayList<>();
        planets.add(mercury);
        planets.add(venus);
        planets.add(earth);
        planets.add(mars);
        planets.add(jupiter);
        planets.add(saturn);
        planets.add(uranus);
        planets.add(neptune);


        PlanetSystem solarSystem = new PlanetSystem("Solar System", Sun, planets);
        System.out.println(solarSystem.toString());
        System.out.println("Radius for Saturn: " + saturn.getRadiusInKm() + "km. " + "and the mass of Saturn: " + saturn.getMassInKg() + "Kg.");
        System.out.println("Radius for Sun: " + Sun.getRadiusInKm() + "km. " + "and the mass of Sun: " + Sun.getMassInKg() + "Kg.");
        System.out.println("Surface gravity on Neptune is: " + neptune.getSurfaceGravity() + " m/s^2.");
        System.out.println("The largest planet is: " + solarSystem.getLargestPlanet().getName() + ", with a radius of: " + solarSystem.getLargestPlanet().getRadius() + " Rjup, and a mass of: " + solarSystem.getLargestPlanet().getMass() + " Mjup.");
        System.out.println("The smallest plannet is: " + solarSystem.getSmallestPlanet().getName() + ", with a radius of: " + solarSystem.getSmallestPlanet().getRadius() + " Rjup, and a mass of: " + solarSystem.getSmallestPlanet().getMass() + " Mjup.");
        System.out.println("The mass of Mars in Mearth is: " + mars.getPlanetMassInMearth());
        System.out.println("The radius of Mars in Rearth is: " + mars.getPlanetRadiusInRearth());
        return solarSystem;
    }

}
