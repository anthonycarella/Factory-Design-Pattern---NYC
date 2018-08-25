package carellaprojects.newyorkcity.boroughs;

public class BaseBorough implements Borough {
    private String boroughName;
    private long population;
    private float squareMiles;
    private String landMass;

    @Override
    public String getBoroughName() {
        return boroughName;
    }

    @Override
    public void setBoroughName(String boroughName) {
        this.boroughName = boroughName;
    }

    @Override
    public long getPopulation() {
        return population;
    }

    @Override
    public void setPopulation(long population2) {
        this.population = population2;
    }

    @Override
    public float getSquareMiles() {
        return squareMiles;
    }

    @Override
    public void setSquareMiles(float squareMiles) {
        this.squareMiles = squareMiles;
    }

    @Override
    public String getLandMass() {
        return landMass;
    }

    @Override
    public void setLandMass(String landMass) {
        this.landMass = landMass;
    }

    @Override
    public void createBorough(String boroughName, long population, float squareMiles, String landMass) {
        this.setBoroughName(boroughName);
        this.setPopulation(population);
        this.setSquareMiles(squareMiles);
        this.setLandMass(landMass);
    }

    public void getBoroughStatistics() {
        System.out.println("=====Borough Statitstics for " + this.boroughName + "=====");
        System.out.println("Population: " + this.population);
        System.out.println("Square Miles: " + this.squareMiles);
        System.out.println("Land Mass: " + this.landMass);
    }
}
