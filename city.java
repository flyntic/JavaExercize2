public class city {
    private String name;
    private String country;
    private long population;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public city(String name,String country,long population){
        this.name = name;
        this.country = country;
        this.population = population;
    }

    @Override
    public String toString()
    {
        return name;
    }
}
