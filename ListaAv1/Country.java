package ListaAv1;

public class Country implements Comparable<Country>{

    private String name;
    private String body;
    private double globalPopulation;
    private double tvAudience;
    private double gdpAudience;


    public Country(String name, String body, double globalPopulation, double tvAudience, double gdpAudience) {
        this.name = name;
        this.body = body;
        this.globalPopulation = globalPopulation;
        this.tvAudience = tvAudience;
        this.gdpAudience = gdpAudience;
    }

    @Override
    public int compareTo(Country outroCountry) {
        return this.getName().compareTo(outroCountry.getName());
    }

    @Override
    public String toString() {
        return " -- País: " + this.getName() + " -- Body: " + this.getBody() + " -- Global Population: " + this.getGlobalPopulation() + 
        " -- Tv Audience: " + this.getTvAudience() + " -- GDP Audience: " + this.getGdpAudience();
    }


    public String getName() {
        return name;
    }
    public String getBody() {
        return body;
    }
    public double getGlobalPopulation() {
        return globalPopulation;
    }
    public double getTvAudience() {
        return tvAudience;
    }
    public double getGdpAudience() {
        return gdpAudience;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setBody(String body) {
        this.body = body;
    }
    public void setGlobalPopulation(double globalPopulation) {
        this.globalPopulation = globalPopulation;
    }
    public void setTvAudience(double tvAudience) {
        this.tvAudience = tvAudience;
    }
    public void setGdpAudience(double gdpAudience) {
        this.gdpAudience = gdpAudience;
    }
   
}
