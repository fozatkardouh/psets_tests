package at.refugeescode.psets_tests.inheritance.animalstalking.version2;

public class Dog extends Pet {

    public Dog(String name) {
        super(name);
    }

    @Override
    protected String getWhatThePetSays() {
        return "WOOF!";
    }

    @Override
    protected String getType() {
        return "Dog";
    }


}
