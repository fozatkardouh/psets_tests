package at.refugeescode.psets_tests.inheritance.animalstalking.version2;

public abstract class Pet {

    private String name;

    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void talk(){
        System.out.println(getType()+ " - " + getName() + " says " + getWhatThePetSays());
    }

    protected abstract String getWhatThePetSays();

    protected abstract String getType();

}
