package main.thebesthummus;

public class Oil {

    private String name;

    private Integer liters;

    public Oil(Integer liters) {
        this.name = "Oil";
        this.liters = liters;
    }

    public String getName() {
        return name;
    }

    public Integer getLiters() {
        return liters;
    }
}
