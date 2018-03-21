package at.refugeescode.psets_tests.inheritance.animalstalking.version2;

public class Cat extends Pet {

    public Cat(String name) {
        super(name);
    }

    @Override
    protected String getWhatThePetSays() {
        return "MIAU!";
    }

    @Override
    protected String getType() {
        return "Cat";
    }


}
