package main.thebesthummus;

public class Yogurt {

    private String name;

    private Integer numberOfSpoons;

    public Yogurt(Integer numberOfSpoons) {
        this.name = "Yogurt";
        this.numberOfSpoons = numberOfSpoons;
    }

    public String getName() {
        return name;
    }

    public Integer getNumberOfSpoons() {
        return numberOfSpoons;
    }
}
