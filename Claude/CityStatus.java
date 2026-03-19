package Claude;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class City implements Comparable<City>{
    private String name;
    private int population;
    public City(String name, int population){
        this.name = name;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", population=" + population +
                '}';
    }

    @Override
    public int compareTo(City other) {
        return Integer.compare(this.getPopulation(), other.getPopulation());
    }
}
public class CityStatus {
    public static void main(String[] args) {
        List<City> cityStatusList = new ArrayList<>();
        cityStatusList.add(new City("kathamndu", 1900000));
        cityStatusList.add(new City("pokhara", 9000));
        cityStatusList.add(new City("bhaktapur", 12000));
        cityStatusList.add(new City("lalitpur", 89000));
        cityStatusList.sort(null);
        System.out.println("Sorted by population: ");
        cityStatusList.forEach(System.out::println);
        Comparator<City> cityComparator = Comparator.comparing(City::getName);
        cityStatusList.sort(cityComparator);
        System.out.println("Sorted by name: ");
        cityStatusList.forEach(System.out::println);
    }
}
