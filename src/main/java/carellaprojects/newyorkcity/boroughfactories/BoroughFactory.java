package carellaprojects.newyorkcity.boroughfactories;

import carellaprojects.newyorkcity.boroughs.Borough;
import carellaprojects.newyorkcity.boroughs.Brooklyn;
import carellaprojects.newyorkcity.boroughs.Manhattan;
import carellaprojects.newyorkcity.boroughs.Queens;
import carellaprojects.newyorkcity.boroughs.StatenIsland;
import carellaprojects.newyorkcity.boroughs.TheBronx;

public class BoroughFactory {
    public BoroughFactory() {
        System.out.println("Creating Borough Factory..........");
    }

    public Borough getBorough(String boroughType) {
        switch(boroughType.toLowerCase()) {
            case "the bronx":
                return new TheBronx();
            case "brooklyn":
                return new Brooklyn();
            case "queens":
                return new Queens();
            case "staten island":
                return new StatenIsland();
            case "manhattan":
                return new Manhattan();
        }
        return null;
    }
}
