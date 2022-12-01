package MapAndFlatMap;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimitivesMap {
    public static void main(String[] args) {
        // We can map int elements of the IntStream to the stream of objects using mapToObj method and collect
        // the resulting stream to the list of Planet objects:
        List<Planet> planets = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8)
                .mapToObj(Planet::new)
                .collect(Collectors.toList());
        System.out.println(planets.size());
        for (Planet planet : planets) {
            System.out.println(planet.getName());
        }
    }
}

class Planet {
    private String name;
    private int orderFromSun;

    public Planet(int orderFromSun) {
        this.orderFromSun = orderFromSun;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOrderFromSun() {
        return orderFromSun;
    }

    public void setOrderFromSun(int orderFromSun) {
        this.orderFromSun = orderFromSun;
    }
}
