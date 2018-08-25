package carellaprojects.newyorkcity.launcher;

import carellaprojects.newyorkcity.boroughfactories.BoroughFactory;
import carellaprojects.newyorkcity.boroughs.Borough;

public class App {
    public static void main(String[] args) {
        System.out.println("Initializing app to create NYC boroughs..........");
        pauseApp();

        //Create a Borough factory.
        BoroughFactory boroughFactory = new BoroughFactory();
        pauseApp();

        //Get a Manhattan object.
        Borough manhattan = boroughFactory.getBorough("Manhattan");
        manhattan.getBoroughStatistics();
        pauseApp();

        //Get a Brooklyn object.
        Borough brooklyn = boroughFactory.getBorough("Brooklyn");
        brooklyn.getBoroughStatistics();
        pauseApp();

        //Get a Queens object.
        Borough queens = boroughFactory.getBorough("Queens");
        queens.getBoroughStatistics();
        pauseApp();

        //Get a Bronx object.
        Borough theBronx = boroughFactory.getBorough("The Bronx");
        theBronx.getBoroughStatistics();
        pauseApp();

        //Get a Staten Island object.
        Borough statenIsland = boroughFactory.getBorough("Staten Island");
        statenIsland.getBoroughStatistics();
        pauseApp();

        System.out.println("All NYC boroughs were created.");
    }

    private static void pauseApp() {
        try {
            Thread.sleep(2000);
            System.out.println("");
        } catch (InterruptedException e) {
            System.out.println("Exception in program delay: thread could not sleep.");
            System.out.println(e.getLocalizedMessage());
            e.printStackTrace();
        }
    }
}
