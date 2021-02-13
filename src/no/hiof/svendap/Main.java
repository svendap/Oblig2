package no.hiof.svendap;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Star Sun = new Star("Sun", 1.0, 1.0,5777);
        Planet Mercury = new Planet("Mercury", 0.03412549655905556, 1.7297154899894627E-4);
        Planet venus = new Planet("Venus", 0.08465003077267387, 0.002564278187565859);
        Planet earth = new Planet("Earth", 0.08911486599899289, 0.003146469968387777);
        Planet mars = new Planet("Mars", 0.04741089912158004, 3.3667017913593256E-4);
        Planet jupiter = new Planet("Jupiter", 1.0, 1.0);
        Planet saturn = new Planet("Saturn", 0.8145247020645666, 0.2994204425711275);
        Planet uranus = new Planet("Uranus", 0.35475297935433336, 0.04573761854583773);
        Planet neptune = new Planet("Neptune", 0.34440217087226543, 0.05395152792413066);


        ArrayList<Planet> planets = new ArrayList<>();
        planets.add(Mercury);
        planets.add(venus);
        planets.add(earth);
        planets.add(mars);
        planets.add(jupiter);
        planets.add(saturn);
        planets.add(uranus);
        planets.add(neptune);

        //********Oppgave 2.2**********
        PlanetSystem solarSystem = new PlanetSystem("Solar System", Sun, planets);
        //*****************************

        System.out.println("\nOppgave 2.3");
        System.out.println(solarSystem.toString());

        System.out.println("\nOppgave 2.4");
        System.out.println("Radius for Saturn: " + saturn.getPlanetRadiusInKm() + "km. " + "and the mass of Saturn: " + saturn.getPlanetMassInKg() + "Kg.");
        System.out.println("Radius for Sun: " + Sun.getStarRadiusInKm() + "km. " + "and the mass of Sun: " + Sun.getStarMassInKg() + "Kg.");

        System.out.println("\nOppgave 2.5:");
        System.out.println("Surface gravity on Neptune is: " + neptune.getSurfaceGravity() + " m/s^2.");


        System.out.println("\nOppgave 2.6:");
        System.out.println("The largest planet is: " + solarSystem.getLargestPlanet().getName() + ", with a radius of: " + solarSystem.getLargestPlanet().getRadius() + " Rjup, and a mass of: " + solarSystem.getLargestPlanet().getMass() + " Mjup.");

        System.out.println("The smallest plannet is: " + solarSystem.getSmallestPlanet().getName() + ", with a radius of: " + solarSystem.getSmallestPlanet().getRadius() + " Rjup, and a mass of: " + solarSystem.getSmallestPlanet().getMass() + " Mjup.");

        System.out.println("\nBonusoppgave 3.1");
        System.out.println("The mass of Mars in Mearth is: " + mars.getPlanetMassInMearth());
        System.out.println("The radius of Mars in Rearth is: " + mars.getPlanetRadiusInRearth());
        }

    }
