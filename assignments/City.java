package collectionAPI.assignments;

public class City {
    private String name;

    public City(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
    @Override
    public boolean equals(Object obj){
        if(this == obj)
            return true;
        if(obj == null || getClass() != obj.getClass())
            return false;

        City city = (City) obj;
        return name.equalsIgnoreCase(city.name);
    }

    @Override
    public int hashCode(){
        return name.toLowerCase().hashCode();
    }

    @Override
    public String toString(){
        return name;
    }
}
