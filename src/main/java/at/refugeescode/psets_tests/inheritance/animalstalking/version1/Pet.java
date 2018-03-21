package at.refugeescode.psets_tests.inheritance.animalstalking.version1;

public abstract class Pet {

    private String name;

    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void talk();

}
