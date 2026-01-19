package ClassAndObjects;

public class Country {
    String name;
    long population;
    String capital;
}

class Cntry{
    public static void main(String[] args) {
        Country country = new Country();

        country.name = "India";
        country.population = 1400000000L;
        country.capital = "New Delhi";

        System.out.println("Name of the Country is: "+country.name);
        System.out.println("Population of the "+country.name+" is: "+country.population);
        System.out.println("Capital of the "+country.name+" is: "+country.capital);
    }
}
