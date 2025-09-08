package Java8.FinalJava8Project;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;

public class HabitablePlanetApp {

    private static final String SOLID = "solid";
    private static final int AVERAGE_EARTH_TEMPERATURE=15;
    private static final double EARTH_SUN_DISTANCE_IN_LIGHT_YEARS = 0.00001581;

    public static void main(String[] args) {
        ArrayList<Planet> planets = PlanetRepository.getPlanets();


        //We have to find a new home in the galaxy - The biggest, coldest and hottest
        System.out.println("the number of planets in the databases: "+ planets.stream().distinct().count());

        Optional<Planet> theBiggest = planets.stream()
                .max(Comparator.comparing(Planet::getSize));
        System.out.println();
        System.out.println("the biggest planet is " + theBiggest.get().getName() +
                " with "+ theBiggest.get().getSize()+ "kms. ");


        Optional<Planet> theColdest = planets.stream()
                .min(Comparator.comparing(Planet::getTemperature));
        System.out.println();
        System.out.println("the coldest planet is "+ theColdest.get().getName()+" with "+ theColdest.get().getTemperature()+"C.");

        Optional<Planet> theHottest = planets.stream()
                .max(Comparator.comparing(Planet::getTemperature));
        System.out.println();
        System.out.println("the hottest planet is "+ theHottest.get().getName()+" with "+ theHottest.get().getTemperature()+"C.");

//      //Find a new home in the galaxy - Top 10 most habitable
        System.out.println();
        System.out.println("The top 10 most habitable planets: ");
        planets.stream()
                .filter(planet -> SOLID.equals(planet.getType()))
                .sorted(Comparator.comparing((Planet p)-> Math.abs(p.getTemperature()- AVERAGE_EARTH_TEMPERATURE))
                        .thenComparing(Planet::getDistanceFromEarth))
                .limit(10)
                .forEach(System.out::println);


        // Find a new home in the galaxy - Earth Sun distance
        System.out.println();
        System.out.println("the planet that is at same distance from its closet star as the earth from the sun: ");
        planets.stream()
                .sorted(Comparator.comparing(p-> Math.abs(p.getClosestStarDistance()-EARTH_SUN_DISTANCE_IN_LIGHT_YEARS)))
                .limit(1)
                .forEach(System.out::println);
        // This gave same solution
        Planet earthSunDistancePlanet = planets.stream()
                .min(Comparator.comparing(p -> Math.abs(p.getClosestStarDistance()-EARTH_SUN_DISTANCE_IN_LIGHT_YEARS)))
                .get();
        System.out.println(earthSunDistancePlanet);
    }
}
