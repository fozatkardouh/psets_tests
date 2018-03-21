package main.thebesthummus;

public class Salt {

    private String name;

    private Integer pinches;

    public Salt(Integer pinches) {
        this.name = "Salt";
        this.pinches = pinches;
    }

    public String getName() {
        return name;
    }

    public Integer getPinches() {
        return pinches;
    }
}
