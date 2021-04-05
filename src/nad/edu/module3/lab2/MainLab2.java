package nad.edu.module3.lab2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Mariia Naduieva
 * @version 1.0.0
 * @project VSEM
 * @class MainLab2
 * @since 05.04.2021 - 18.54
 **/

public class MainLab2 {
    public static void main(String[] args) {
        List<ITrainTrip> list = new ArrayList<>(
                Arrays.asList(
                        new StandardClass("Укрзалізниця", 100, 100, false),
                        new StandardClass("Globaltrans", 200, 700, true),
                        new StandardClass("Railways", 150, 1500, false),
                        new StandardClass("Voyageur", 300, 600, false),
                        new StandardClass("Globaltrans", 250, 300, false),
                        new BusinessClass("Укрзалізниця", 100, 500, false,
                                true, true, true),
                        new BusinessClass("Globaltrans", 150, 500, false,
                                true, true, true),
                        new BusinessClass("Globaltrans", 200, 900, false,
                                false, false, false),
                        new BusinessClass("Railways", 150, 1000, false,
                                false, true, true),
                        new BusinessClass("Voyageur", 300, 600, false,
                                true, false, true)
                )
        );

        double totalTripPrice = list.stream().mapToDouble(ITrainTrip::getTripPrice).sum();
        double hightTripPrice = list.stream().mapToDouble(ITrainTrip::getTripPrice).max().getAsDouble();
        double cheapTripPrice = list.stream().mapToDouble(ITrainTrip::getTripPrice).min().getAsDouble();
        double midTripPrice = list.stream().mapToDouble(ITrainTrip::getTripPrice).average().getAsDouble();
        List<ITrainTrip>  moreThan15k = list.stream().filter(item -> item.getTripPrice() > 15000 )
                .collect(Collectors.toList());
        System.out.println("Sum of all trip price: " + totalTripPrice);
        System.out.println("The highest trip price: " + hightTripPrice);
        System.out.println("The cheapest trip price: " + cheapTripPrice);
        System.out.println("Average trip price: " + midTripPrice + '\n');
        System.out.println("All trips that cost more than 15 000: " + '\n' + moreThan15k);
    }
}

/*
Sum of all trip price: 82150.0
The highest trip price: 15900.0
The cheapest trip price: 1500.0
Average trip price: 8215.0

All trips that cost more than 15 000:
[BusinessClass {
nameOfCompany = 'Railways'
numberOfSeats = 150
kilometrage = 1000
isChildren = false
isMealService = false
isConferenceRoom = true
isPlayroom = true
}
]

 */
