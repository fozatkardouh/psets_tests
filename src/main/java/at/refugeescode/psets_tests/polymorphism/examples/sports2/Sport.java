package main.polymorphism.examples.sports2;


// Design principle DRY (Don't Repeat Yourself)

// We explain how "getName" and "getNumberOfPlayers" work
// therefore we use an abstract class instead of the interface
// because we can already put this code in one single place
// and all its children will inherit it and be able to use it

public abstract class Sport {

    private String name;

    private Integer numberOfPlayers;

    public Sport(String name, Integer numberOfPlayers) {
        this.name = name;
        this.numberOfPlayers = numberOfPlayers;
    }

    public String getName() {
        return name;
    }

    public Integer getNumberOfPlayers() {
        return numberOfPlayers;
    }
}
