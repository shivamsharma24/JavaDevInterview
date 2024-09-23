package streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Flights {
    private String flightNo;
    private String flightName;
    private double price;

    // Constructor, getters, and setters

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Flights(String flightNo, String flightName, double price) {
        this.flightNo = flightNo;
        this.flightName = flightName;
        this.price = price;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public String getFlightName() {
        return flightName;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flights flights = (Flights) o;
        return Objects.equals(flightNo, flights.flightNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flightNo);
    }
}

//merging using flatMap
class MergeListUsingFlatMap {
    public static void main(String[] args) {
        List<Flights> l1 = new ArrayList<>(Arrays.asList(
                new Flights("FL001", "Flight 1", 100.0),
                new Flights("FL002", "Flight 2", 150.0)
        ));

        List<Flights> l2 = new ArrayList<>(Arrays.asList(
                new Flights("FL003", "Flight 3", 200.0),
                new Flights("FL001", "Flight 1", 100.0)
        ));

        List<Flights> l3 = new ArrayList<>(Arrays.asList(
                new Flights("FL004", "Flight 4", 250.0),
                new Flights("FL003", "Flight 3", 200.0)
        ));

        //1. We need to merge the three different list
        //2. We need to remove the duplicate flightNo
        List<Flights> mergedList = Stream.of(l1, l2, l2)
                .flatMap(Collection::stream)
                .distinct()
                .collect(Collectors.toList());

        //increase the price by 5%
        mergedList.forEach(f -> f.setPrice(f.getPrice() * 1.05));
        mergedList.forEach(f -> System.out.println(f.getFlightName() + "  " + f.getFlightNo() + " " + f.getPrice()));

    }
}

class MergeListUsingConcat {
    public static void main(String[] args) {
        List<Flights> l1 = new ArrayList<>(Arrays.asList(
                new Flights("FL001", "Flight 1", 100.0),
                new Flights("FL002", "Flight 2", 150.0)
        ));

        List<Flights> l2 = new ArrayList<>(Arrays.asList(
                new Flights("FL003", "Flight 3", 200.0),
                new Flights("FL001", "Flight 1", 100.0)
        ));

        List<Flights> l3 = new ArrayList<>(Arrays.asList(
                new Flights("FL004", "Flight 4", 250.0),
                new Flights("FL003", "Flight 3", 200.0)
        ));

        //1. We need to merge the three different list using concat
        List<Flights> mergeList = Stream
                .concat(Stream.concat(l1.stream(), l2.stream()), l3.stream())
                .distinct()
                .collect(Collectors.toList());

        //increase the price by 5%
        mergeList.forEach(f -> f.setPrice(f.getPrice() * 1.05));
        mergeList.forEach(f -> System.out.println(f.getFlightName() + "  " + f.getFlightNo() + " " + f.getPrice()));
    }
}


