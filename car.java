public class car {
    private String name;
    private String brend;
    private int year;
    private double engineCapacity;

    public   car(String name,String brend,int year,double engineCapacity)
    {   this.name = name;
        this.brend = brend;
        this.year = year;
        this.engineCapacity = engineCapacity;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getBrend() {
        return brend;
    }

    public void setBrend(String brend) {
        this.brend = brend;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return this.name + " " + brend + " "+ year+" года выпуска ";

    }

}
