package collectionAPI.assignments;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Collection;

public class UniqueCity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<City> citySet = new HashSet<>();
        boolean running = true;

        while(running){
            System.out.println("====Delivery Service City Tracker=====");
            System.out.println("1.Add a city");
            System.out.println("2.Display all unique cities");
            System.out.println("3.Check if delivery is available in the city");
            System.out.println("4.Exit");
            System.out.println("Enter your choice (1-4): ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 1:
                    System.out.print("Enter a city name to add: ");
                    String cityName = scanner.nextLine();
                    City newCity = new City(cityName);
                    if(citySet.add(newCity))
                        System.out.println(cityName + " added to the delivery list");
                    else
                        System.out.println(cityName + "already in the delivery list");
                    break;
                case 2:
                    System.out.println("All cities where delivery is available");
                    Iterator<City> iterator = citySet.iterator();
                    while(iterator.hasNext()){
                        System.out.println("- " + iterator.next());
                    }
                    break;
                case 3:
                    System.out.print("Enter a city name to check: ");
                    String citytoCheck = scanner.nextLine();
                    City tempCity = new City(citytoCheck);
                    if(citySet.contains(tempCity)){
                        System.out.println("Delivery is Available in " + citytoCheck);
                    }else{
                        System.out.println("Delivery is not Available in " + citytoCheck);
                    }
                    break;
                case 4:
                    running = false;
                    System.out.print("Exiting.... Have a good day!");
                    break;
                default:
                    System.out.println("Invalid Choice");

            }
        }
    }
}
