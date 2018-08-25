package carellaprojects.newyorkcity.boroughs;

public interface Borough {
    public String getBoroughName();
    public void setBoroughName(String boroughName);
    public long getPopulation();
    public void setPopulation(long population);
    public float getSquareMiles();
    public void setSquareMiles(float squareMiles);
    public String getLandMass();
    public void setLandMass(String landMass);
    public void createBorough(String boroughName, long population, float squareMiles, String landMass);
    public void getBoroughStatistics();
}
