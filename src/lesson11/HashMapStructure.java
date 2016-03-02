package lesson11;

import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by dmitry on 01.03.16.
 */
public class HashMapStructure {

    public static void main(String[] args) {

        Country india=new Country("India",10000);
        Country japan=new Country("Japan",100000);

        Country france=new Country("France",20000);
        Country russia=new Country("Russia",200000);

        HashMap<Country,String> countryCapitalMap=new HashMap<>();
        countryCapitalMap.put(india,"Delhi");
        countryCapitalMap.put(japan,"Tokyo");
        countryCapitalMap.put(france,"Paris");
        countryCapitalMap.put(russia,"Moscow");

        Iterator<Country> countryCapitalIter=countryCapitalMap.keySet().iterator();

        while(countryCapitalIter.hasNext())
        {
            Country countryObj=countryCapitalIter.next();
            String capital=countryCapitalMap.get(countryObj);
            System.out.println(countryObj.getName()+"----"+capital);
        }
    }

    static public class Country {

        String name;
        long population;

        public Country(String name, long population) {
            this.name = name;
            this.population = population;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public long getPopulation() {
            return population;
        }
        public void setPopulation(long population) {
            this.population = population;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Country country = (Country) o;

            if (population != country.population) return false;
            return name != null ? name.equals(country.name) : country.name == null;

        }

        @Override
        public int hashCode() {
            int result = name != null ? name.hashCode() : 0;
            result = 31 * result + (int) (population ^ (population >>> 32));
            return result;
        }
    }
}
